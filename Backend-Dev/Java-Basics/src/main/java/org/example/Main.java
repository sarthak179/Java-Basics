package org.example;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import org.example.Client.ExampleRestClient;
import org.example.Exceptions.IllegalArgumentException;
import org.example.HttpClient.Client;
import org.example.Model.CommentResponse;
import org.example.Model.ExampleMessage;
import org.example.Model.PhotoResponse;
import org.example.Client.RestClient;
import retrofit2.Call;
import retrofit2.HttpException;
import retrofit2.Response;

import java.io.*;
import java.net.http.HttpClient;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, IllegalArgumentException {

        switch (args[0] ) {

            case "example" :
                System.out.println(Client.run("https://example.com"));

            case "merge" :
                MergeAndSortFiles.sortNumbersInFiles();
                break;

            case "getPhotos" :

                RestClient restClient = new RestClient();
                Response<List<PhotoResponse>> apiResponse = restClient.getJsonPlaceHolderAPI().getPhotos().execute();
                apiResponse.body().forEach(photoResponse -> {
                    System.out.println(photoResponse.getThumbnailUrl());
                });
                break;

            case "comments" :
                try {
                    RestClient restClient1 = new RestClient();
                    Response<List<CommentResponse>> apiResponse1 = restClient1.getJsonPlaceHolderAPI().getComments().execute();
                    apiResponse1.body().forEach(commentResponse -> {
                        System.out.println(commentResponse.getName());
                    });
                } catch (Exception e) {
                    throw new IllegalArgumentException("Please check argument");
                }
        }
    }
}