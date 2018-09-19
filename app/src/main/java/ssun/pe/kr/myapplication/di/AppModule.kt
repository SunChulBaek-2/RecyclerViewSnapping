package ssun.pe.kr.myapplication.di

import android.content.Context
import android.content.pm.PackageManager
import dagger.Module
import dagger.Provides
import ssun.pe.kr.myapplication.App
import ssun.pe.kr.myapplication.data.AppLocalDataSource
import ssun.pe.kr.myapplication.data.AppRepository
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun provideContext(application: App): Context {
        return application.applicationContext
    }

    @Provides
    fun packageManager(context: Context): PackageManager {
        return context.packageManager
    }

    @Singleton
    @Provides
    fun provideRepository(
            localDataSource: AppLocalDataSource
    ): AppRepository {
        return AppRepository(localDataSource)
    }
}