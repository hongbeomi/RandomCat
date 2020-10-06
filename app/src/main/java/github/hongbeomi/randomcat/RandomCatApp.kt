package github.hongbeomi.randomcat

import android.app.Application
import github.hongbeomi.randomcat.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class RandomCatApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@RandomCatApp)
            modules(
                listOf(
                    dataSourceModule,
                    repositoryModule,
                    viewModelModule,
                    networkModule,
                    useCaseModule
                )
            )
        }
    }

}