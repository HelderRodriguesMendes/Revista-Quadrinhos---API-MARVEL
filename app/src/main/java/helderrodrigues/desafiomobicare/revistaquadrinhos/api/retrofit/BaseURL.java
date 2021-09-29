package helderrodrigues.desafiomobicare.revistaquadrinhos.api.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseURL {
    public Retrofit base_url(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://gateway.marvel.com/v1/public/").
                addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }
}
