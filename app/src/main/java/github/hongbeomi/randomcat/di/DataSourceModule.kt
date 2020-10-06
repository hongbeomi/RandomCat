package github.hongbeomi.randomcat.di

import github.hongbeomi.randomcat.data.remote.CatRemoteDataSource
import github.hongbeomi.randomcat.data.remote.CatRemoteDataSourceImpl
import org.koin.dsl.module

val dataSourceModule = module {
    single<CatRemoteDataSource> { CatRemoteDataSourceImpl(service = get()) }
}