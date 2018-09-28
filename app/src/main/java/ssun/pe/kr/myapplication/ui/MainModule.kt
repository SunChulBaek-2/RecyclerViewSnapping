package ssun.pe.kr.myapplication.ui

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ssun.pe.kr.myapplication.di.ViewModelKey

@Module
abstract class MainModule {

    @Binds
    abstract fun bindViewModelFactory(factory: MainViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainFragmentViewModel(viewModel: MainViewModel): ViewModel
}