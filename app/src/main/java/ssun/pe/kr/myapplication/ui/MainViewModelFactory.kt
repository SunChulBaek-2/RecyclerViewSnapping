package ssun.pe.kr.myapplication.ui

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import ssun.pe.kr.myapplication.data.AppDataRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(
        private val appDataRepository: AppDataRepository
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(appDataRepository) as T
    }
}