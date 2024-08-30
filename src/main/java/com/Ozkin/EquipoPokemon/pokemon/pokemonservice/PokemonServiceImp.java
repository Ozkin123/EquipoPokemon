package com.Ozkin.EquipoPokemon.pokemon.pokemonservice;

import com.Ozkin.EquipoPokemon.pokemon.pokemonentity.PokemonEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PokemonServiceImp implements IPokemonService {

    private RestTemplate restTemplate = new RestTemplate();
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public Object getPokemon(String url) {
        return restTemplate.getForObject(url,Object.class);
    }

    @Override
    public String mensejeInjection() {
        return "Probando inyeccion Dependencias";
    }
}
