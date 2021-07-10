package com.luan.app19_buscacep.domain

import com.luan.app19_buscacep.data.model.CEP
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CEPService {
    @GET("{cepInserido}/json/")
    suspend fun buscarCEP(
        @Path("cepInserido") cep : String
    ) : Response<CEP>
}