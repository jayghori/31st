package com.example.a31st;

import com.example.a31st.Model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonServices {

    @GET("posts")
    Call<List<Post>>  getAllPost();
}
