package ssun.pe.kr.myapplication.data

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import ssun.pe.kr.myapplication.App

class AppLocalDataSource : AppDataSource {
    private val context = App.context

    override fun getInstalledApps(): List<ApplicationInfo> {
        return context.packageManager.getInstalledApplications(PackageManager.GET_META_DATA)
    }
}