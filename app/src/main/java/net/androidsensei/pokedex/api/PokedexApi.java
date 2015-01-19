package net.androidsensei.pokedex.api;

import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import net.androidsensei.pokedex.PokedexApplication;
import net.androidsensei.pokedex.model.Pokemon;
import net.androidsensei.pokedex.model.PokemonAdapter;
import net.androidsensei.pokedex.model.PokemonList;

import java.util.Arrays;
import java.util.List;

/**
 * Created by alex on 1/18/15.
 */
public class PokedexApi {
    private static final String MI_POKEDEX_URL = "http://mi-pokedex.herokuapp.com/api";
    private PokemonAdapter pokemonAdapter;
    private ProgressBar progressBarLoading;
    private ListView listView;
    public static void getPokemons( Response.Listener listener,  Response.ErrorListener errorListener){
         GsonRequest<PokemonList> getPersons =
                new GsonRequest<PokemonList>(MI_POKEDEX_URL+"/pokemons", PokemonList.class, listener, errorListener);
        PokedexApplication.getInstance().addToRequestQueue(getPersons);
    }
}
