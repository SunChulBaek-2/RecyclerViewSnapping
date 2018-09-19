package ssun.pe.kr.myapplication.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ssun.pe.kr.myapplication.ui.MainActivity
import ssun.pe.kr.myapplication.ui.MainModule

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainModule::class])
    abstract fun mainActivity(): MainActivity
}