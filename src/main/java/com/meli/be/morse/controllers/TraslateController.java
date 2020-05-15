package com.meli.be.morse.controllers;

import com.meli.be.morse.model.Morse;
import com.meli.be.morse.traslate.Traslate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/meli/action/traslate")
public class TraslateController {

    @Autowired
    private Traslate traslate;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseStatus(code= HttpStatus.OK)
    public String traslateMorse2Human(@RequestBody Morse morse) {
        if(morse == null || morse.getText().isEmpty()){
            return "Morse text is required";
        }
        return traslate.traslate2Human(morse.getText());
    }
}
