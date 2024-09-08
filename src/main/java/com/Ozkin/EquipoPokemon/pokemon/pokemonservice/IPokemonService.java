package com.Ozkin.EquipoPokemon.pokemon.pokemonservice;

import com.Ozkin.EquipoPokemon.pokemon.pokemondto.PokemonDTO;

public interface IPokemonService {
    public PokemonDTO getPokemon(String url);

    public String mensejeInjection();

}
