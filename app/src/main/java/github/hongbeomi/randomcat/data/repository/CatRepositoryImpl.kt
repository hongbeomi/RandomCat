package github.hongbeomi.randomcat.data.repository

import github.hongbeomi.randomcat.data.remote.CatRemoteDataSource
import github.hongbeomi.randomcat.model.Cat

class CatRepositoryImpl(private val remoteDataSource: CatRemoteDataSource) : CatRepository {

    override suspend fun getImages(limit: Int, page: Int): List<Cat> {
        return remoteDataSource.getImages(limit, page)
    }

}