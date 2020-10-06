package github.hongbeomi.randomcat.di

import github.hongbeomi.randomcat.data.repository.CatRepository
import github.hongbeomi.randomcat.data.repository.CatRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {
    single<CatRepository> { CatRepositoryImpl(remoteDataSource = get()) }
}