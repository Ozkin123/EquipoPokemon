package com.Ozkin.EquipoPokemon.pokemon.pokemondto;
import com.Ozkin.EquipoPokemon.pokemon.pokemondto.Species;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PokemonDTO (
        @JsonProperty("species") Species pokemon) implements Serializable {



}
