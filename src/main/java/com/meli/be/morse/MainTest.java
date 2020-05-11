package com.meli.be.morse;

public class MainTest {

    public static void main(String[] args) {
        Integer[] array = completeWithPulseByPositions(0, 5, false, null);

        array = completeWithPulseByPositions(1, 2, true, array);

        completeWithPulseByPositions(0, 4, true, array);
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
