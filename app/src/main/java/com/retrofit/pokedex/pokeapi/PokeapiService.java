package com.retrofit.pokedex.pokeapi;

import com.retrofit.pokedex.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeapiService {

    // En el Call(Retrofit) de tipo PokemonRespuesta ponemos la clase que maneja la respuesta

    @GET("pokemon") // Que accion realizará y con que URL GET es solo obtención de datos
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);
}
