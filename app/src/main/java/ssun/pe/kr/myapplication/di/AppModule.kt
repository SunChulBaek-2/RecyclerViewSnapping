package ssun.pe.kr.myapplication.di

import android.content.Context
import android.content.pm.PackageManager
import dagger.Module
import dagger.Provides
import ssun.pe.kr.myapplication.App
import ssun.pe.kr.myapplication.data.AppDataSource
import ssun.pe.kr.myapplication.data.LocalAppDataSource
import ssun.pe.kr.myapplication.data.AppDataRepository
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
    fun provideAppLocalDataSource(
            context: Context,
            pm: PackageManager
    ): AppDataSource {
        return LocalAppDataSource(context, pm)
    }

    @Singleton
    @Provides
    fun provideRepository(
            localDataSource: AppDataSource
    ): AppDataRepository {
        return AppDataRepository(localDataSource)
    }
}