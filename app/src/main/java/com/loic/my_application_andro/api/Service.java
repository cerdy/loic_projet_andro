package com.loic.my_application_andro.api;

import com.loic.my_application_andro.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Service {
    @GET("%3E1000")
    Call<ItemResponse> getItems();
}
///search/users?q=language:java+location:lagos