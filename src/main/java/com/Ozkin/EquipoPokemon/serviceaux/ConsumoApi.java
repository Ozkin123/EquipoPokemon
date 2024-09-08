package com.Ozkin.EquipoPokemon.serviceaux;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumoApi implements IConsumoAPi{

    private final RestTemplate restTemplate;

    public ConsumoApi(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @Override
    public <T> T consumirApi(String url, Class<T> clase) {
        return restTemplate.getForObject(url,clase);
    }
}
