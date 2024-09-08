package com.Ozkin.EquipoPokemon.pokemon.pokemonservice;

import com.Ozkin.EquipoPokemon.pokemon.pokemonentity.PokemonEntity;
import com.Ozkin.EquipoPokemon.serviceaux.ConsumoApi;
import org.springframework.stereotype.Service;


@Service
public class PokemonServiceImp implements IPokemonService {

    private final ConsumoApi consumoApi;

    public PokemonServiceImp(ConsumoApi consumoApi) {
        this.consumoApi = consumoApi;
    }


    @Override
    public PokemonEntity getPokemon(String url) {
        return consumoApi.consumirApi(url,PokemonEntity.class);
    }

    @Override
    public String mensejeInjection() {
        return "Probando inyeccion Dependencias";
    }
}
