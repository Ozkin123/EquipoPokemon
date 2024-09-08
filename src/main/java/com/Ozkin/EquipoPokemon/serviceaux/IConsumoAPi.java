package com.Ozkin.EquipoPokemon.serviceaux;

public interface IConsumoAPi {

    public  <T> T consumirApi (String url,Class<T> clase);
}
