package com.jhdev.pruebacatalogo.services;

import com.jhdev.pruebacatalogo.dto.RedditResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jorge Henao on 29/10/2017.
 */

public interface RedditService {

    @GET("/reddits.json")
    Call<RedditResponse> getObjects();
}
