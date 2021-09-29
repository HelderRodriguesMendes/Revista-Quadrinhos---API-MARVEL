package helderrodrigues.desafiomobicare.revistaquadrinhos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

import helderrodrigues.desafiomobicare.revistaquadrinhos.api.model.CharacterDataContainer;
import helderrodrigues.desafiomobicare.revistaquadrinhos.api.model.CharacterDataWrapper;
import helderrodrigues.desafiomobicare.revistaquadrinhos.api.model.ResponseBody;
import helderrodrigues.desafiomobicare.revistaquadrinhos.api.retrofit.BaseURL;
import helderrodrigues.desafiomobicare.revistaquadrinhos.api.retrofit.service.MarvelService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    BaseURL baseURL = new BaseURL();
    MarvelService marvelService;
    CharacterDataContainer responses;
    ResponseBody responseBody;
    private final String privateKey = "5cbc49e593f8a495f55d1534bc291660305fd734";
    private final String publicKey = "dff7ec8e0751db95fd9d03f33ccda720";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            getCharacters();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public void getCharacters() throws NoSuchAlgorithmException {
        marvelService = baseURL.base_url().create(MarvelService.class);

        Call<CharacterDataContainer> call = marvelService.getCharacters(timesTamp(), publicKey, getHashMd5(timesTamp() + privateKey + publicKey));
        call.enqueue(new Callback<CharacterDataContainer>() {
            @Override
            public void onResponse(Call<CharacterDataContainer> call, Response<CharacterDataContainer> response) {
                System.out.println("mensagem " + response.message());
                if(response.isSuccessful()){
                    responses = response.body();
                    if(responses.getResults().isEmpty()){

                    }

                }
                System.out.println("ERRO: " + response.message());
            }

            @Override
            public void onFailure(Call<CharacterDataContainer> call, Throwable t) {
                System.out.println( "erro: " + t.getMessage());
            }
        });

    }

    public String getHashMd5(String value) throws NoSuchAlgorithmException {
        MessageDigest m=MessageDigest.getInstance("MD5");
        m.update(value.getBytes(),0,value.length());
        return new BigInteger(1,m.digest()).toString(16);
    }

    private String timesTamp(){
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd.HH:mm:ss");
        String timeStamp = date.format(new Date());
        return timeStamp;
    }
}