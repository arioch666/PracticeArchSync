package div_bytes.com.practicearch

import android.app.Application
import div_bytes.com.practicearch.universal.API_NETWORK_BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 *@author div@hello.com (div-hello)
 */

class CustomApplication: Application() {

    companion object {
        val retrofitInstance: Retrofit =Retrofit.Builder()
        .baseUrl(API_NETWORK_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    }

}