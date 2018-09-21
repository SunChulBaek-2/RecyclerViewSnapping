package ssun.pe.kr.myapplication.data

import android.content.pm.ApplicationInfo
import kotlinx.coroutines.experimental.Deferred
import ssun.pe.kr.myapplication.data.model.Item
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDataRepository @Inject constructor(
        private val localAppDataSource: AppDataSource
) {

    fun getItems(): Deferred<List<Item>> {
        return localAppDataSource.getItems()
    }

    fun getInstalledApps(): Deferred<List<ApplicationInfo>> {
        return localAppDataSource.getInstalledApps()
    }
}