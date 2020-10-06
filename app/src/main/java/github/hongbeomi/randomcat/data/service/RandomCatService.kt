package github.hongbeomi.randomcat.data.service

import github.hongbeomi.randomcat.model.Cat
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomCatService {

    @GET("search")
    suspend fun getImages(@Query("limit") limit: Int, @Query("page") page: Int): List<Cat>

}