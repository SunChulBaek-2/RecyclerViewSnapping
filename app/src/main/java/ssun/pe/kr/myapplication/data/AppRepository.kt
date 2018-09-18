package ssun.pe.kr.myapplication.data

import android.content.pm.ApplicationInfo

object AppRepository : AppDataSource {
    val local: AppDataSource = AppLocalDataSource()

    override fun getInstalledApps(): List<ApplicationInfo> {
        return local.getInstalledApps()
    }
}