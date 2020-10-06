package github.hongbeomi.randomcat.di

import github.hongbeomi.randomcat.domain.ImagesPagingDataSource
import org.koin.dsl.module

val useCaseModule = module {

    factory { ImagesPagingDataSource(catRepository = get()) }

}