package com.meli.be.morse.traslate;

import com.meli.be.morse.utils.Alphabet;
import org.springframework.stereotype.Service;

@Service
public class Traslate {

    public String traslate2Human(String morseMessage) {
        if(morseMessage == null)
            return "";
        String[] splitToMorseMessage = morseMessage.split(" ");
        StringBuilder stBuilder = new StringBuilder();
        int emptyCount = 0;
        for(String morseLetter : splitToMorseMessage) {
            String currentLetter = " ";
            if(morseLetter.isEmpty()) {
                emptyCount++;
            } else {
                emptyCount = 0;
                currentLetter = Alphabet.getLetterByMorsecode(morseLetter);
            }
            if(emptyCount <= 1)
                stBuilder.append(currentLetter);
        }
        return stBuilder.toString();
    }
}