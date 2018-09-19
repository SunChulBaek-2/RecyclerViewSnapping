package ssun.pe.kr.myapplication.data

import android.content.pm.ApplicationInfo
import kotlinx.coroutines.experimental.Deferred
import ssun.pe.kr.myapplication.data.model.Item
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppRepository @Inject constructor(
        private val local: AppDataSource
) : AppDataSource {

    override fun getItems(): Deferred<List<Item>> {
        return local.getItems()
    }

    override fun getInstalledApps(): Deferred<List<ApplicationInfo>> {
        return local.getInstalledApps()
    }
}