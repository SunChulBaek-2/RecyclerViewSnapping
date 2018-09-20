package ssun.pe.kr.myapplication.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.pm.ApplicationInfo
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.launch
import ssun.pe.kr.myapplication.data.AppDataSource
import ssun.pe.kr.myapplication.data.model.Item
import javax.inject.Inject
import javax.inject.Named

class MainViewModel @Inject constructor(
        @Named("repository") private val repository: AppDataSource
): ViewModel() {
    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>>
        get() = _items

    private val _installedApps = MutableLiveData<List<ApplicationInfo>>()
    val installedApps: LiveData<List<ApplicationInfo>>
        get() = _installedApps

    fun getItems() = launch(UI) {
        _items.value = repository.getItems().await()
    }

    fun getInstalledApps() = launch(UI) {
        _installedApps.value = repository.getInstalledApps().await()
    }
}