package com.example.rynek.serve

import java.io.BufferedReader
import java.io.FileOutputStream
import java.io.InputStreamReader
import java.net.URL
import java.nio.channels.Channels

fun get_latest_release_info(Repository:String):String{
    val before = "https://api.github.com/repos/"
    val after = "/releases/latest"
    return getStringFromUrl(before+Repository+after)
}

fun getStringFromUrl(url: String): String {
    val stringBuilder = StringBuilder()

    try {
        val urlConnection = URL(url).openConnection()
        val inputStream = urlConnection.getInputStream()
        val reader = BufferedReader(InputStreamReader(inputStream, "UTF-8"))

        var line: String?
        while (reader.readLine().also { line = it } != null) {
            stringBuilder.append(line).append("\n")
        }

        reader.close()
        inputStream.close()
    } catch (e: Exception) {
        e.printStackTrace()
        // Handle exceptions if the URL cannot be accessed or the data cannot be read
    }

    return stringBuilder.toString()
}

fun downloadFile(fileUrl: String, outputFilePath: String) {
    try {
        val url = URL(fileUrl)
        val connection = url.openConnection()
        val inputStream = connection.getInputStream()

        val outputStream = FileOutputStream(outputFilePath)
        val channel = Channels.newChannel(inputStream)
        val buffer = java.nio.ByteBuffer.allocate(1024)

        while (channel.read(buffer) > 0) {
            buffer.flip()
            outputStream.channel.write(buffer)
            buffer.clear()
        }

        outputStream.close()
        channel.close()
        inputStream.close()

        println("File downloaded successfully to: $outputFilePath")
    } catch (e: Exception) {
        e.printStackTrace()
        println("File download failed: ${e.message}")
    }
}