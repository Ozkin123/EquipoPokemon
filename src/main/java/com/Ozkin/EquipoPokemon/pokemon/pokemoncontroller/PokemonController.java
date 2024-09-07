package com.Ozkin.EquipoPokemon.pokemon.pokemoncontroller;

import com.Ozkin.EquipoPokemon.pokemon.pokemonentity.PokemonEntity;
import com.Ozkin.EquipoPokemon.pokemon.pokemonservice.IPokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

    private IPokemonService pokemonService;

    public PokemonController(IPokemonService pokemonService){
        this.pokemonService=pokemonService;
    }


     private String uriCharizard = "https://pokeapi.co/api/v2/pokemon/charizard";
    @GetMapping("/charizard")
    public PokemonEntity getPokemon(){
        return pokemonService.getPokemon(uriCharizard);
    }
}


