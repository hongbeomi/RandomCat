package github.hongbeomi.randomcat.di

import github.hongbeomi.randomcat.ui.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        MainViewModel(
            imagesPagingDataSource = get()
        )
    }
}