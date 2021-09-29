package helderrodrigues.desafiomobicare.revistaquadrinhos.api.retrofit.service;

import helderrodrigues.desafiomobicare.revistaquadrinhos.api.model.CharacterDataContainer;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MarvelService {
    @GET("characters")
    Call<CharacterDataContainer> getCharacters(@Query("ts") String timesTemp, @Query("apikey") String apikey, @Query("hash") String hash);
}
