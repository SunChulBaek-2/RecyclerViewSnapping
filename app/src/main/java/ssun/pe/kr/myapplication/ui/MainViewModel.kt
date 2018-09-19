package ssun.pe.kr.myapplication.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.pm.ApplicationInfo
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch
import ssun.pe.kr.myapplication.data.AppRepository
import ssun.pe.kr.myapplication.data.model.Item
import javax.inject.Inject

class MainViewModel @Inject constructor(
        private val repo: AppRepository
): ViewModel() {
    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>>
        get() = _items

    private val _installedApps = MutableLiveData<List<ApplicationInfo>>()
    val installedApps: LiveData<List<ApplicationInfo>>
        get() = _installedApps

    fun getItems() = launch(UI) {
        _items.value = repo.getItems().await()
    }

    fun getInstalledApps() = launch(UI) {
        _installedApps.value = repo.getInstalledApps().await()
    }
}