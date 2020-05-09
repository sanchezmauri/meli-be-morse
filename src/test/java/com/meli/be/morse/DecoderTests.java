package com.meli.be.morse;

import com.meli.be.morse.decoder.Decoder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DecoderTests {

    private static final String MORSE_MESSAGE = ".... --- .-.. .-     -- . .-.. ..";

    @Autowired
    private Decoder decoder;

    @Test
    public void decodeBit2MoseText() throws Exception {
        Integer[] bits = new Integer[100];

        assertEquals(decoder.decodeBit2Morse(bits), MORSE_MESSAGE, "Los mensajes del decoder deberian ser iguales y no lo son");
    }
}
