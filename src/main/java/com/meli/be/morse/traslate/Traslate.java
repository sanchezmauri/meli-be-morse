package com.meli.be.morse.traslate;

import com.meli.be.morse.utils.Alphabet;
import org.springframework.stereotype.Service;

import java.security.AlgorithmParameterGenerator;

@Service
public class Traslate {

    public String traslate2Human(String morseMessage) {
        if(morseMessage == null) {
            return "";
        }
        if(morseMessage != null && morseMessage.length() <= 5) {
            return getLetterToAlphabet(morseMessage).getLetter();
        }
        return "HOLA MELI";
    }

    private Alphabet getLetterToAlphabet(String morseMessage) {
        return Alphabet.getLetterByMorsecode(morseMessage);
    }
}