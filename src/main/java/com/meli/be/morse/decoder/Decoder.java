package com.meli.be.morse.decoder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Decoder {

    @Value("${pulse.threshold.default}")
    private int pulseThreshold;

    @Value("${pause.threshold.default}")
    private int pauseThreshold;

    public String decodeBit2Morse(Integer[] bits) {
        int pulseStreamCounter = 0;
        int pauseStreamCounter = 0;
        int backBit = bits[0];
        StringBuilder stBuilder = new StringBuilder();

        for (Integer bit : bits) {
            if(bit != null && bit == 1)
                pulseStreamCounter++;
            if(bit != null && bit == 0) {
                pauseStreamCounter++;
            }

            if(bit == null || backBit != bit) {
                if(backBit == 1) {
                    if (pulseStreamCounter <= this.pulseThreshold)
                        stBuilder.append(".");
                    else
                        stBuilder.append("-");
                    pulseStreamCounter = 0;
                } else {
                    if(pauseStreamCounter <= this.pauseThreshold)
                        stBuilder.append(" ");
                    else
                        stBuilder.append("      ");
                    pauseStreamCounter = 0;
                }
                if(bit == null) {
                    break;
                } else {
                    backBit = bit;
                }
            }
        }

        return stBuilder.toString();
    }

    public void setPulseThreshold(int pulseThreshold) {
        this.pulseThreshold = pulseThreshold;
    }

    public void setPauseThreshold(int pauseThreshold) {
        this.pauseThreshold = pauseThreshold;
    }
}