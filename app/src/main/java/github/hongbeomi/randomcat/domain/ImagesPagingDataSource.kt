package github.hongbeomi.randomcat.domain

import androidx.paging.PagingSource
import github.hongbeomi.randomcat.data.repository.CatRepository
import github.hongbeomi.randomcat.model.Cat

class ImagesPagingDataSource(
    private val catRepository: CatRepository
) : PagingSource<Int, Cat>() {

    companion object {
        const val LIMIT_SIZE = 12
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Cat> {
        return try {
            val page = params.key ?: 0
            val prevKey = if (page == 0) null else page - 1

            LoadResult.Page(
                data = catRepository.getImages(LIMIT_SIZE, page),
                prevKey = prevKey,
                nextKey = page.plus(1)
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

}