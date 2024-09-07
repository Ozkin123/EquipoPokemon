package com.Ozkin.EquipoPokemon.pokemon.pokemonentity;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PokemonEntity (
        @JsonProperty("species") Species pokemon) implements Serializable {



}
