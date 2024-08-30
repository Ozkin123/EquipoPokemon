package com.Ozkin.EquipoPokemon.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {


    @GetMapping("/hola")
    public String getHolaMundo(){
        return "Hola mundo";
    }

}
