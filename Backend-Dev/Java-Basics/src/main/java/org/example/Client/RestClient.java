package org.example.Client;

import okhttp3.OkHttpClient;
import org.example.APIs.JSONPlaceHolderAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    JSONPlaceHolderAPI jsonPlaceHolderAPI;
    public RestClient() {

        Retrofit retrofit = new Retrofit.Builder()
                .client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();

        jsonPlaceHolderAPI = retrofit.create(JSONPlaceHolderAPI.class);
    }

    public JSONPlaceHolderAPI getJsonPlaceHolderAPI() {
        return jsonPlaceHolderAPI;
    }
}
