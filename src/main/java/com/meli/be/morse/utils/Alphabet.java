package com.meli.be.morse.utils;

import java.util.HashMap;
import java.util.Map;

public enum Alphabet {

    A("A", ".-"),
    B("B", "-..."),
    C("C", "-.-."),
    D("D", "-.."),
    E("E", "."),
    F("F", "..-."),
    G("G", "--."),
    H("H", "...."),
    I("I", ".."),
    J("J", ".---"),
    K("K", "-.-"),
    L("L", ".-.."),
    M("M", "--"),
    N("N", "-."),
    O("O", "---"),
    P("P", ".--."),
    Q("Q", "--.-"),
    R("R", ".-."),
    S("S", "..."),
    T("T", "-"),
    U("U", "..-"),
    V("V", "...-"),
    W("W", ".--"),
    X("X", "-..-"),
    Y("Y", "-.--"),
    Z("Z", "--.."),
    ZERO("0", "-----"),
    ONE("1", ".----"),
    TWO("2", "..---"),
    THREE("3", "...--"),
    FOUR("4", "....-"),
    FIVE("5", "....."),
    SIX("6", "-...."),
    SEVEN("7", "--..."),
    EIGHT("8", "---.."),
    NINE("9", "----.");

    private static Map<String, Alphabet> letterMapByMorseCode;

    private String letter;
    private String morseValue;

    private Alphabet(String letter, String morseValue) {
        this.letter = letter;
        this.morseValue = morseValue;
    }

    public String getLetter() {
        return letter;
    }

    public String getMorseValue() {
        return morseValue;
    }

    public static Alphabet getLetterByMorsecode(String morseCode){
        if(letterMapByMorseCode == null){
            initMapping();
        }
        return letterMapByMorseCode.get(morseCode);
    }

    private static void initMapping(){
        letterMapByMorseCode = new HashMap<>();
        for(Alphabet letter : values()){
            letterMapByMorseCode.put(letter.getMorseValue(), letter);
        }
    }
}
