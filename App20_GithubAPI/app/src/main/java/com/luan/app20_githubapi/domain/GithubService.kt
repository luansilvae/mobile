package com.luan.app20_githubapi.domain

import com.luan.app20_githubapi.data.model.Github
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("{login}")
    suspend fun buscarUsuario(
        @Path("login") usuario : String
    ) : Response<Github>
}