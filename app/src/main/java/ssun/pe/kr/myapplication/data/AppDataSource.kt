package ssun.pe.kr.myapplication.data

import android.content.pm.ApplicationInfo
import kotlinx.coroutines.experimental.Deferred
import ssun.pe.kr.myapplication.data.model.Item

interface AppDataSource {
    fun getItems(): Deferred<List<Item>>
    fun getInstalledApps(): Deferred<List<ApplicationInfo>>
}