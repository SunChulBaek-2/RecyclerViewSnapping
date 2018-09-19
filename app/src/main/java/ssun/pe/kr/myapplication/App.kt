package ssun.pe.kr.myapplication

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import ssun.pe.kr.myapplication.di.DaggerAppComponent

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }
}