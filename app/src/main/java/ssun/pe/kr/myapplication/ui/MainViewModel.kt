package ssun.pe.kr.myapplication.ui

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.content.pm.ApplicationInfo
import kotlinx.coroutines.experimental.CoroutineScope
import kotlinx.coroutines.experimental.Dispatchers
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.android.Main
import kotlinx.coroutines.experimental.launch
import ssun.pe.kr.myapplication.data.AppDataRepository
import ssun.pe.kr.myapplication.data.model.Item
import timber.log.Timber
import javax.inject.Inject
import kotlin.coroutines.experimental.CoroutineContext

class MainViewModel @Inject constructor(
        private val repository: AppDataRepository
): ViewModel(), CoroutineScope {

    private val job = Job()
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    private val _items = MutableLiveData<List<Item>>()
    val items: LiveData<List<Item>>
        get() = _items

    private val _installedApps = MutableLiveData<List<ApplicationInfo>>()
    val installedApps: LiveData<List<ApplicationInfo>>
        get() = _installedApps

    // TODO : 호출되지 않음
    override fun onCleared() {
        super.onCleared()

        Timber.d("[x1210x] onCleared()")

        job.cancel()
    }

    fun getItems() = launch {
        _items.value = repository.getItems().await()
    }

    fun getInstalledApps() = launch {
        _installedApps.value = repository.getInstalledApps().await()
    }
}