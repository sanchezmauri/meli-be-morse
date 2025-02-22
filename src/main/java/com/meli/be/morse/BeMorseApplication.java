package com.meli.be.morse;

import com.meli.be.morse.decoder.Decoder;
import com.meli.be.morse.traslate.Traslate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class BeMorseApplication {

	private static long thresholdShortPause;
	private static int pauseThreshold;
	private static int pulseThreshold;

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(BeMorseApplication.class, args);

		thresholdShortPause = new Long(appContext.getEnvironment().getProperty("threshold.short.pause.miliseconds"));
		pauseThreshold = Integer.parseInt(appContext.getEnvironment().getProperty("pause.threshold.default"));
		pulseThreshold = Integer.parseInt(appContext.getEnvironment().getProperty("pulse.threshold.default"));

		doRunApplication();
	}

	public static void doRunApplication() {
		while(true) {
			Decoder decoder = new Decoder();
			decoder.setPauseThreshold(pauseThreshold);
			decoder.setPulseThreshold(pulseThreshold);

			int streamCounter = 0;
			long startPauseTime = System.currentTimeMillis();
			long finishPauseTime = 0l;
			StringBuilder stBuilder = new StringBuilder();
			Integer[] pulse = new Integer[20];
			try {
				while(true) {
					Integer input = System.in.read();
					boolean finishExec = false;
					switch (input) {
						case 32:
							pulse[streamCounter] = 1;
							streamCounter++;
							break;
						case 10:
							finishPauseTime = System.currentTimeMillis();
							long diffBetweenTimes = finishPauseTime - startPauseTime;
							long pauseCount = 0l;
							for(int index = streamCounter; pauseCount <= diffBetweenTimes; index++) {
								pulse[index] = 0;
								pauseCount += thresholdShortPause;
							}
							String letter = decoder.decodeBit2Morse(pulse);
							System.out.println("The entered code is: " + letter);
							stBuilder.append(letter);

							startPauseTime = finishPauseTime;
							streamCounter = 0;
							pulse = new Integer[20];
							break;
						default:
							finishExec = true;
							break;
					}
					if(finishExec)
						break;
				}
			}
			catch (ArrayIndexOutOfBoundsException|IOException e){
				System.out.println("Too long pause..");
			}
			Traslate traslate = new Traslate();
			System.out.println("El texto morse completo es: " + stBuilder.toString());
			System.out.println("El texto en humano es: " + traslate.traslate2Human(stBuilder.toString()));
		}
	}
}
