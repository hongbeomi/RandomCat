package github.hongbeomi.randomcat.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import github.hongbeomi.randomcat.domain.ImagesPagingDataSource

class MainViewModel(
    private val imagesPagingDataSource: ImagesPagingDataSource
) : ViewModel() {

    companion object {
        const val PAGING_PAGE_SIZE = 10
    }

    val imageList = Pager(PagingConfig(pageSize = PAGING_PAGE_SIZE)) {
        imagesPagingDataSource
    }.flow.cachedIn(viewModelScope)

}