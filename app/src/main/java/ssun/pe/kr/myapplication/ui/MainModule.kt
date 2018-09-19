package ssun.pe.kr.myapplication.ui

import android.arch.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ssun.pe.kr.myapplication.di.ViewModelKey

@Module
abstract class MainModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainFragmentViewModel(viewModel: MainViewModel): ViewModel
}