package com.example.rynek.serve

import android.app.DownloadManager
import android.content.Context
import android.os.Environment
import androidx.core.net.toUri

class AndroidDownloader( private val context: Context) {

    private val downloadManager = context.getSystemService(DownloadManager::class.java)
    fun downloadFile(url: String): Long {
        val request = DownloadManager.Request(url.toUri()).setMimeType("dummy").setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "dummy.apk")

        return downloadManager.enqueue(request)
    }
}