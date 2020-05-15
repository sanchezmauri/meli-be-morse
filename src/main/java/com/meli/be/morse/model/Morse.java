package com.meli.be.morse.model;

import java.util.Objects;

public class Morse {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Morse morse = (Morse) o;
        return Objects.equals(text, morse.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        return "Morse{" +
                "text='" + text + '\'' +
                '}';
    }
}
