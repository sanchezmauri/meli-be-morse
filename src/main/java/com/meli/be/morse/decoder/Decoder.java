package com.meli.be.morse.decoder;

import org.springframework.stereotype.Service;

@Service
public class Decoder {

    public String decodeBit2Morse(Integer[] bits) {
        return ".... --- .-.. .-     -- . .-.. ..";
    }
}
