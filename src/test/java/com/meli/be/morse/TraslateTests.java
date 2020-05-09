package com.meli.be.morse;

import com.meli.be.morse.traslate.Traslate;
import com.meli.be.morse.utils.Alphabet;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TraslateTests {

    private static final String MORSE_HOLA_MELI = ".... --- .-.. .-      -- . .-.. ..";
    private static final String HOLA_MELI_MESSAGE = "HOLA MELI";

    private static final String MORSE_SENTENCE_1 = "..-. .-. .- ... .      .--. .- .-. .-      - . ... -";
    private static final String SENTENCE_1_MESSAGE = "FRASE PARA TEST";

    private static final String MORSE_SENTENCE_2 = ". ... -.-. .-. .. -... .. .-.     .     .. -- .--. .-.. . -- -. - .- .-.      .-.. --- ...      - . ... -";
    private static final String SENTENCE_2_MESSAGE = "ESCRIBIR E IMPLEMNTAR LOS TEST";

    private static final String MORSE_SENTENCE_3 = "-.-. --- -- .--. .-. .         ..- -. .-     .--. .-.. .- -.--      ....-      . -.      -- . .-.. ..       .--. --- .-.    .---- ..... ..... ..---";
    private static final String SENTENCE_3_MESSAGE = "COMPRE UNA PLAY 4 EN MELI POR 1552";

    @Autowired
    private Traslate traslate;

    @Test
    public void traslate2humanHolaMeli() throws Exception {
        assertEquals(HOLA_MELI_MESSAGE, traslate.traslate2Human(MORSE_HOLA_MELI),"Los mensajes del decoder deberian ser iguales y no lo son");
    }

    @Test
    public void traslate2humanSentence1() throws Exception {
        assertEquals(SENTENCE_1_MESSAGE, traslate.traslate2Human(MORSE_SENTENCE_1), "Los mensajes del decoder deberian ser iguales y no lo son");
    }

    @Test
    public void traslate2humanSentence2() throws Exception {
        assertEquals(SENTENCE_2_MESSAGE, traslate.traslate2Human(MORSE_SENTENCE_2),"Los mensajes del decoder deberian ser iguales y no lo son");
    }

    @Test
    public void traslate2humanSentence3() throws Exception {
        assertEquals(SENTENCE_3_MESSAGE, traslate.traslate2Human(MORSE_SENTENCE_3),"Los mensajes del decoder deberian ser iguales y no lo son");
    }

    @Test
    public void traslate2humaNullText() throws Exception {
        assertEquals(traslate.traslate2Human(null), "", "Si le envio un null debe retorname vacío");
    }

    @Test
    public void traslate2humanA() {
        assertEquals(traslate.traslate2Human(Alphabet.A.getMorseValue()), Alphabet.A.getLetter(), "El traductor no esta devolviendo la letra A");
    }

    @Test
    public void traslate2humanB() {
        assertEquals(traslate.traslate2Human(Alphabet.B.getMorseValue()), Alphabet.B.getLetter(), "El traductor no esta devolviendo la letra B");
    }

    @Test
    public void traslate2humanC() {
        assertEquals(traslate.traslate2Human(Alphabet.C.getMorseValue()), Alphabet.C.getLetter(), "El traductor no esta devolviendo la letra C");
    }

    @Test
    public void traslate2humanD() {
        assertEquals(traslate.traslate2Human(Alphabet.D.getMorseValue()), Alphabet.D.getLetter(), "El traductor no esta devolviendo la letra D");
    }

    @Test
    public void traslate2humanE() {
        assertEquals(traslate.traslate2Human(Alphabet.E.getMorseValue()), Alphabet.E.getLetter(), "El traductor no esta devolviendo la letra E");
    }

    @Test
    public void traslate2humanF() {
        assertEquals(traslate.traslate2Human(Alphabet.F.getMorseValue()), Alphabet.F.getLetter(), "El traductor no esta devolviendo la letra F");
    }

    @Test
    public void traslate2humanG() {
        assertEquals(traslate.traslate2Human(Alphabet.G.getMorseValue()), Alphabet.G.getLetter(), "El traductor no esta devolviendo la letra G");
    }

    @Test
    public void traslate2humanH() {
        assertEquals(traslate.traslate2Human(Alphabet.H.getMorseValue()), Alphabet.H.getLetter(), "El traductor no esta devolviendo la letra H");
    }

    @Test
    public void traslate2humanI() {
        assertEquals(traslate.traslate2Human(Alphabet.I.getMorseValue()), Alphabet.I.getLetter(), "El traductor no esta devolviendo la letra I");
    }

    @Test
    public void traslate2humanJ() {
        assertEquals(traslate.traslate2Human(Alphabet.J.getMorseValue()), Alphabet.J.getLetter(), "El traductor no esta devolviendo la letra J");
    }

    @Test
    public void traslate2humanK() {
        assertEquals(traslate.traslate2Human(Alphabet.K.getMorseValue()), Alphabet.K.getLetter(), "El traductor no esta devolviendo la letra K");
    }

    @Test
    public void traslate2humanL() {
        assertEquals(traslate.traslate2Human(Alphabet.L.getMorseValue()), Alphabet.L.getLetter(), "El traductor no esta devolviendo la letra L");
    }

    @Test
    public void traslate2humanM() {
        assertEquals(traslate.traslate2Human(Alphabet.M.getMorseValue()), Alphabet.M.getLetter(), "El traductor no esta devolviendo la letra M");
    }

    @Test
    public void traslate2humanN() {
        assertEquals(traslate.traslate2Human(Alphabet.N.getMorseValue()), Alphabet.N.getLetter(), "El traductor no esta devolviendo la letra N");
    }

    @Test
    public void traslate2humanO() {
        assertEquals(traslate.traslate2Human(Alphabet.O.getMorseValue()), Alphabet.O.getLetter(), "El traductor no esta devolviendo la letra O");
    }

    @Test
    public void traslate2humanP() {
        assertEquals(traslate.traslate2Human(Alphabet.P.getMorseValue()), Alphabet.P.getLetter(), "El traductor no esta devolviendo la letra P");
    }

    @Test
    public void traslate2humanQ() {
        assertEquals(traslate.traslate2Human(Alphabet.Q.getMorseValue()), Alphabet.Q.getLetter(), "El traductor no esta devolviendo la letra Q");
    }

    @Test
    public void traslate2humanR() {
        assertEquals(traslate.traslate2Human(Alphabet.R.getMorseValue()), Alphabet.R.getLetter(), "El traductor no esta devolviendo la letra R");
    }

    @Test
    public void traslate2humanS() {
        assertEquals(traslate.traslate2Human(Alphabet.S.getMorseValue()), Alphabet.S.getLetter(), "El traductor no esta devolviendo la letra S");
    }

    @Test
    public void traslate2humanT() {
        assertEquals(traslate.traslate2Human(Alphabet.T.getMorseValue()), Alphabet.T.getLetter(), "El traductor no esta devolviendo la letra T");
    }

    @Test
    public void traslate2humanU() {
        assertEquals(traslate.traslate2Human(Alphabet.U.getMorseValue()), Alphabet.U.getLetter(), "El traductor no esta devolviendo la letra U");
    }

    @Test
    public void traslate2humanV() {
        assertEquals(traslate.traslate2Human(Alphabet.V.getMorseValue()), Alphabet.V.getLetter(), "El traductor no esta devolviendo la letra V");
    }

    @Test
    public void traslate2humanW() {
        assertEquals(traslate.traslate2Human(Alphabet.W.getMorseValue()), Alphabet.W.getLetter(), "El traductor no esta devolviendo la letra W");
    }

    @Test
    public void traslate2humanX() {
        assertEquals(traslate.traslate2Human(Alphabet.X.getMorseValue()), Alphabet.X.getLetter(), "El traductor no esta devolviendo la letra X");
    }

    @Test
    public void traslate2humanY() {
        assertEquals(traslate.traslate2Human(Alphabet.Y.getMorseValue()), Alphabet.Y.getLetter(), "El traductor no esta devolviendo la letra Y");
    }

    @Test
    public void traslate2humanZ() {
        assertEquals(traslate.traslate2Human(Alphabet.Z.getMorseValue()), Alphabet.Z.getLetter(), "El traductor no esta devolviendo la letra Z");
    }

    @Test
    public void traslate2humanZERO() {
        assertEquals(traslate.traslate2Human(Alphabet.ZERO.getMorseValue()), Alphabet.ZERO.getLetter(), "El traductor no esta devolviendo el numero 0");
    }

    @Test
    public void traslate2humanONE() {
        assertEquals(traslate.traslate2Human(Alphabet.ONE.getMorseValue()), Alphabet.ONE.getLetter(), "El traductor no esta devolviendo el numero 1");
    }

    @Test
    public void traslate2humanTWO() {
        assertEquals(traslate.traslate2Human(Alphabet.TWO.getMorseValue()), Alphabet.TWO.getLetter(), "El traductor no esta devolviendo el numero 2");
    }

    @Test
    public void traslate2humanTHREE() {
        assertEquals(traslate.traslate2Human(Alphabet.THREE.getMorseValue()), Alphabet.THREE.getLetter(), "El traductor no esta devolviendo el numero 3");
    }

    @Test
    public void traslate2humanFOUR() {
        assertEquals(traslate.traslate2Human(Alphabet.FOUR.getMorseValue()), Alphabet.FOUR.getLetter(), "El traductor no esta devolviendo el numero 4");
    }

    @Test
    public void traslate2humanFIVE() {
        assertEquals(traslate.traslate2Human(Alphabet.FIVE.getMorseValue()), Alphabet.FIVE.getLetter(), "El traductor no esta devolviendo el numero 5");
    }

    @Test
    public void traslate2humanSIX() {
        assertEquals(traslate.traslate2Human(Alphabet.SIX.getMorseValue()), Alphabet.SIX.getLetter(), "El traductor no esta devolviendo el numero 6");
    }

    @Test
    public void traslate2humanSEVEN() {
        assertEquals(traslate.traslate2Human(Alphabet.SEVEN.getMorseValue()), Alphabet.SEVEN.getLetter(), "El traductor no esta devolviendo el numero 7");
    }

    @Test
    public void traslate2humanEIGHT() {
        assertEquals(traslate.traslate2Human(Alphabet.EIGHT.getMorseValue()), Alphabet.EIGHT.getLetter(), "El traductor no esta devolviendo el numero 8");
    }

    @Test
    public void traslate2humanNINE() {
        assertEquals(traslate.traslate2Human(Alphabet.NINE.getMorseValue()), Alphabet.NINE.getLetter(), "El traductor no esta devolviendo el numero 9");
    }
}