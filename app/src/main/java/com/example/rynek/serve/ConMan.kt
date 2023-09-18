package com.example.rynek.serve

import android.util.Log
import okhttp3.*
import java.io.IOException

fun get_latest_release(Repository:String){

}

fun get_http(Url:String): String {
    var client:OkHttpClient = OkHttpClient()
    if(Url.isBlank()){
        return "blank str"
    }
    val request = Request.Builder()
        .url(Url)
        .build()

    client.newCall(request).enqueue(object : Callback{
        override fun onFailure(call: Call, e: IOException) {
            e.printStackTrace()
        }

        override fun onResponse(call: Call, response: Response) {
            Log.i("response","message recived")
            response.use {
                if(!response.isSuccessful){
                    Log.e("Http Error","oppsie dizy")
                }else{

                }
            }
        }
    })
    return "dummy"
}

