package com.example.latihan_praktikum_retrofit.api

import com.example.latihan_praktikum_retrofit.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}