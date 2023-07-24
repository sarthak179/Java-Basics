package org.example.APIs;

import org.example.Model.ExampleMessage;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ExampleAPI {
    @GET("")
    Call<String> getExampleResponse();
}
