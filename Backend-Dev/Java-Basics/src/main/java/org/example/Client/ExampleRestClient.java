package org.example.Client;

import okhttp3.OkHttpClient;
import org.example.APIs.ExampleAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ExampleRestClient {
    ExampleAPI exampleAPI;
    public ExampleRestClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://example.com")
                .build();
        exampleAPI = retrofit.create(ExampleAPI.class);
    }
    public ExampleAPI getExampleAPI() {
        return exampleAPI;
    }
}
