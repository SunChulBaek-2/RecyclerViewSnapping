package ssun.pe.kr.myapplication.data

import android.content.pm.ApplicationInfo
import ssun.pe.kr.myapplication.data.model.Item

interface AppDataSource {
    fun getItems(): List<Item>
    fun getInstalledApps(): List<ApplicationInfo>
}