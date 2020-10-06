package github.hongbeomi.randomcat.data.remote

import github.hongbeomi.randomcat.data.service.RandomCatService
import github.hongbeomi.randomcat.model.Cat

class CatRemoteDataSourceImpl(private val service: RandomCatService) : CatRemoteDataSource {

    override suspend fun getImages(limit: Int, page: Int): List<Cat> {
        return service.getImages(limit, page)
    }

}