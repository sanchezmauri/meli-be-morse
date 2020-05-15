package com.meli.be.morse;

import com.meli.be.morse.decoder.Decoder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DecoderTests {

    private static Integer[] MORSE_PULSE_UNITY = null;

    private static final String MORSE_MESSAGE_POINT = ".";
    private static final String MORSE_MESSAGE_LINE = "-";

    private static final String MORSE_MESSAGE_SHORT_SPACE = " ";
    private static final String MORSE_MESSAGE_LARGE_SPACE = "      ";

    private static final String MORSE_MESSAGE_POINT_SHORT_SPACE_POINT = ". .";
    private static final String MORSE_MESSAGE_POINT_SHORT_SPACE_LINE = ". -";
    private static final String MORSE_MESSAGE_POINT_SHORT_SPACE_LINE_LARGE_SPACE_LINE = ". -      -";

    @Autowired
    private Decoder decoder;

    @Test
    public void decoderBits2MorseOneBitAndThresholdIsOne() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 1,false, null);
        decoder.setPulseThreshold(1);

        assertEquals(MORSE_MESSAGE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseTwoBitAndThresholdIsOne() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 2,false, null);
        decoder.setPulseThreshold(1);

        assertEquals(MORSE_MESSAGE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseThreBitAndThresholdIsOne() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 3,false, null);
        decoder.setPulseThreshold(1);

        assertEquals(MORSE_MESSAGE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFourBitAndThresholdIsOne() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 4,false, null);
        decoder.setPulseThreshold(1);

        assertEquals(MORSE_MESSAGE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFiveBitAndThresholdIsOne() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 5,false, null);
        decoder.setPulseThreshold(1);

        assertEquals(MORSE_MESSAGE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseOneBitAndThresholdIsTwo() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 1,false, null);
        decoder.setPulseThreshold(2);

        assertEquals(MORSE_MESSAGE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseTwoBitAndThresholdIsTwo() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 2,false, null);
        decoder.setPulseThreshold(2);

        assertEquals(MORSE_MESSAGE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseThreBitAndThresholdIsTwo() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 3,false, null);
        decoder.setPulseThreshold(2);

        assertEquals(MORSE_MESSAGE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFourBitAndThresholdIsTwo() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 4,false, null);
        decoder.setPulseThreshold(2);

        assertEquals(MORSE_MESSAGE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFiveBitAndThresholdIsTwo() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 5,false, null);
        decoder.setPulseThreshold(2);

        assertEquals(MORSE_MESSAGE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseOneBitAndThresholdIsThree() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 1,false, null);
        decoder.setPulseThreshold(3);

        assertEquals(MORSE_MESSAGE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseTwoBitAndThresholdIsThree() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 2,false, null);
        decoder.setPulseThreshold(3);

        assertEquals(MORSE_MESSAGE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseThreBitAndThresholdIsThree() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 3,false, null);
        decoder.setPulseThreshold(3);

        assertEquals(MORSE_MESSAGE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFourBitAndThresholdIsThree() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 4,false, null);
        decoder.setPulseThreshold(3);

        assertEquals(MORSE_MESSAGE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFiveBitAndThresholdIsThree() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 5,false, null);
        decoder.setPulseThreshold(3);

        assertEquals(MORSE_MESSAGE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseOneBitAndThresholdIsFour() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 1,false, null);
        decoder.setPulseThreshold(4);

        assertEquals(MORSE_MESSAGE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseTwoBitAndThresholdIsFour() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 2,false, null);
        decoder.setPulseThreshold(4);

        assertEquals(MORSE_MESSAGE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseThreBitAndThresholdIsFour() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 3,false, null);
        decoder.setPulseThreshold(4);

        assertEquals(MORSE_MESSAGE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFourBitAndThresholdIsFour() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 4,false, null);
        decoder.setPulseThreshold(4);

        assertEquals(MORSE_MESSAGE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFiveBitAndThresholdIsFour() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 5,false, null);
        decoder.setPulseThreshold(4);

        assertEquals(MORSE_MESSAGE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseOnePauseAndThresholdIsOne() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 1,false, null);
        decoder.setPauseThreshold(1);

        assertEquals(MORSE_MESSAGE_SHORT_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseTwoPauseAndThresholdIsOne() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 2,false, null);
        decoder.setPauseThreshold(1);

        assertEquals(MORSE_MESSAGE_LARGE_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseThrePauseAndThresholdIsOne() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 3,false, null);
        decoder.setPauseThreshold(1);

        assertEquals(MORSE_MESSAGE_LARGE_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFourPauseAndThresholdIsOne() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 4,false, null);
        decoder.setPauseThreshold(1);

        assertEquals(MORSE_MESSAGE_LARGE_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFivePauseAndThresholdIsOne() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 5,false, null);
        decoder.setPauseThreshold(1);

        assertEquals(MORSE_MESSAGE_LARGE_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseOnePauseAndThresholdIsTwo() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 1,false, null);
        decoder.setPauseThreshold(2);

        assertEquals(MORSE_MESSAGE_SHORT_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseTwoPauseAndThresholdIsTwo() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 2,false, null);
        decoder.setPauseThreshold(2);

        assertEquals(MORSE_MESSAGE_SHORT_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseThrePauseAndThresholdIsTwo() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 3,false, null);
        decoder.setPauseThreshold(2);

        assertEquals(MORSE_MESSAGE_LARGE_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFourPauseAndThresholdIsTwo() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 4,false, null);
        decoder.setPauseThreshold(2);

        assertEquals(MORSE_MESSAGE_LARGE_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFivePauseAndThresholdIsTwo() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 5,false, null);
        decoder.setPauseThreshold(2);

        assertEquals(MORSE_MESSAGE_LARGE_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseOnePauseAndThresholdIsThree() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 1,false, null);
        decoder.setPauseThreshold(3);

        assertEquals(MORSE_MESSAGE_SHORT_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseTwoPauseAndThresholdIsThree() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 2,false, null);
        decoder.setPauseThreshold(3);

        assertEquals(MORSE_MESSAGE_SHORT_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseThrePauseAndThresholdIsThree() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 3,false, null);
        decoder.setPauseThreshold(3);

        assertEquals(MORSE_MESSAGE_SHORT_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFourPauseAndThresholdIsThree() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 4,false, null);
        decoder.setPauseThreshold(3);

        assertEquals(MORSE_MESSAGE_LARGE_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFivePauseAndThresholdIsThree() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 5,false, null);
        decoder.setPauseThreshold(3);

        assertEquals(MORSE_MESSAGE_LARGE_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseOnePauseAndThresholdIsFour() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 1,false, null);
        decoder.setPauseThreshold(4);

        assertEquals(MORSE_MESSAGE_SHORT_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseTwoPauseAndThresholdIsFour() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 2,false, null);
        decoder.setPauseThreshold(4);

        assertEquals(MORSE_MESSAGE_SHORT_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseThrePauseAndThresholdIsFour() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 3,false, null);
        decoder.setPauseThreshold(4);

        assertEquals(MORSE_MESSAGE_SHORT_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFourPauseAndThresholdIsFour() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 4,false, null);
        decoder.setPauseThreshold(4);

        assertEquals(MORSE_MESSAGE_SHORT_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorseFivePauseAndThresholdIsFour() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 5,false, null);
        decoder.setPauseThreshold(4);

        assertEquals(MORSE_MESSAGE_LARGE_SPACE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorsePointShortSpacePointByDefaultThreshold() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 2,false, null);
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 2, true, MORSE_PULSE_UNITY);
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 2, true, MORSE_PULSE_UNITY);

        assertEquals(MORSE_MESSAGE_POINT_SHORT_SPACE_POINT, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorsePointShortSpaceLineByDefaultThreshold() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 2,false, null);
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 2, true, MORSE_PULSE_UNITY);
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 3, true, MORSE_PULSE_UNITY);
        decoder.setPauseThreshold(2);
        decoder.setPulseThreshold(2);

        assertEquals(MORSE_MESSAGE_POINT_SHORT_SPACE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    @Test
    public void decoderBits2MorsePointShortSpaceLineLargeSpaceLineByDefaultThreshold() throws Exception {
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 2,false, null);
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 2, true, MORSE_PULSE_UNITY);
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 3, true, MORSE_PULSE_UNITY);
        MORSE_PULSE_UNITY = completeWithPulseByPositions(0, 4, true, MORSE_PULSE_UNITY);
        MORSE_PULSE_UNITY = completeWithPulseByPositions(1, 4, true, MORSE_PULSE_UNITY);
        decoder.setPauseThreshold(2);
        decoder.setPulseThreshold(2);

        assertEquals(MORSE_MESSAGE_POINT_SHORT_SPACE_LINE_LARGE_SPACE_LINE, decoder.decodeBit2Morse(MORSE_PULSE_UNITY));
    }

    private static Integer[] completeWithPulseByPositions(int pulse, int quatity, boolean isAddToEnd, Integer[] arrayOfBits) {
        if(!isAddToEnd) {
            arrayOfBits = new Integer[100];
            for (int index = 0; index < quatity; index++) {
                arrayOfBits[index] = pulse;
            }
            return arrayOfBits;
        } else {
            int numberOfPulse = 0;
            for (int index = 0; index < 100; index++){
                if(arrayOfBits[index] == null) {
                    numberOfPulse = index;
                    break;
                }
            }
            int quantityTotal = numberOfPulse + quatity;
            for (int index = numberOfPulse; index < (quantityTotal); index++) {
                arrayOfBits[index] = pulse;
            }
            return arrayOfBits;
        }
    }
}