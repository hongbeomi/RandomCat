package github.hongbeomi.randomcat.data.repository

import github.hongbeomi.randomcat.model.Cat

interface CatRepository {

    suspend fun getImages(limit: Int, page: Int) : List<Cat>

}