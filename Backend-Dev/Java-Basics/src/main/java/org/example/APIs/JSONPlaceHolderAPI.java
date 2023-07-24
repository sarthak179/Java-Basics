package org.example.APIs;

import org.example.Model.CommentResponse;
import org.example.Model.PhotoResponse;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;


public interface JSONPlaceHolderAPI {
    @GET("/photos")
    Call<List<PhotoResponse>> getPhotos();

    @GET("/comments")
    Call<List<CommentResponse>> getComments();
}
