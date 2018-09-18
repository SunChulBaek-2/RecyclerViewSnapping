package ssun.pe.kr.myapplication.data

import android.content.pm.ApplicationInfo

interface AppDataSource {
    fun getInstalledApps(): List<ApplicationInfo>
}