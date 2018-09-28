package ssun.pe.kr.myapplication.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
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