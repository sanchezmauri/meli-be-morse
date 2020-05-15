package com.meli.be.morse;

import com.meli.be.morse.decoder.Decoder;
import com.meli.be.morse.traslate.Traslate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class BeMorseApplication {

	private static final long thresholdShortPause = 1000;

	public static void main(String[] args) {
		SpringApplication.run(BeMorseApplication.class, args);

		while(true) {
			Decoder decoder = new Decoder();
			decoder.setDefaultThresholds();
			int streamCounter = 0;
			long startPauseTime = System.currentTimeMillis();
			long finishPauseTime = 0l;
			StringBuilder stBuilder = new StringBuilder();
			Integer[] pulse = new Integer[20];
			try {
				while(true) {
					Integer input = System.in.read();
					if(input == 32){
						pulse[streamCounter] = 1;
						streamCounter++;
					}
					if(input == 101){
						break;
					}
					if(input == 10) {
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
					}
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
