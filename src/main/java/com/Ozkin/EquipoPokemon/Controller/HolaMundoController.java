package com.Ozkin.EquipoPokemon.Controller;


import com.Ozkin.EquipoPokemon.pokemon.pokemonservice.IPokemonService;
import com.Ozkin.EquipoPokemon.pokemon.pokemonservice.PokemonServiceImp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    private IPokemonService iPokemonService;

    public HolaMundoController(IPokemonService iPokemonService){
        this.iPokemonService = iPokemonService;
    }


    @GetMapping("/hola")
    public String getHolaMundo(){
        return "Hola mundo";
    }
    @GetMapping("/inyeccion")
    public String getDependecia(){
        return iPokemonService.mensejeInjection();
    }



}
