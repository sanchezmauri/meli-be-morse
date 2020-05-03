package com.meli.be.morse;

import static org.junit.jupiter.api.Assertions.*;

import com.meli.be.morse.decoder.Decoder;
import com.meli.be.morse.traslate.Traslate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;

@SpringBootTest
class BeMorseApplicationTests {

	private static final String DECODER_ERROR_MESSAGE = "Los mensajes del decoder deberian ser iguales y no lo son";
	private static final String MORSE_MESSAGE = ".... --- .-.. .-     -- . .-.. ..";
	private static final String HELLO_MELI_MESSAGE = "HOLA MELI";

	@Autowired
	private Decoder decoder;

	@Autowired
	private Traslate traslate;

	@Test
	public void decodeBit2MoseText() throws Exception {
		Integer[] bits = new Integer[100];

		assertEquals(decoder.decodeBit2Morse(bits), MORSE_MESSAGE, DECODER_ERROR_MESSAGE);
	}

	@Test
	public void traslate2humanText() throws Exception {
		assertEquals(traslate.traslate2Human(MORSE_MESSAGE), HELLO_MELI_MESSAGE, "");
	}
}
