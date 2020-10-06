package github.hongbeomi.randomcat.data.remote

import github.hongbeomi.randomcat.model.Cat


interface CatRemoteDataSource {

    suspend fun getImages(limit: Int, page: Int) : List<Cat>

}