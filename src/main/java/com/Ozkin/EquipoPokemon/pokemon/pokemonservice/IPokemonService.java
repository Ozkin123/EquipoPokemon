package com.Ozkin.EquipoPokemon.pokemon.pokemonservice;

import com.Ozkin.EquipoPokemon.pokemon.pokemonentity.PokemonEntity;

public interface IPokemonService {
    public PokemonEntity getPokemon(String url);

    public String mensejeInjection();

}
