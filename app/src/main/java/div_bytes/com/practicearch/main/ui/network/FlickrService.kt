package div_bytes.com.practicearch.main.ui.network

import div_bytes.com.practicearch.universal.API_NETWORK_BASE_URL
import div_bytes.com.practicearch.universal.IMAGE_NETWORK_BASE_URL
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

/**
 *@author div@hello.com (div-hello)
 */

interface FlickrService {

    @GET(API_NETWORK_BASE_URL)
    fun listImagesByFilter(@QueryMap options: Map<String, String>)

    @GET(IMAGE_NETWORK_BASE_URL)
    fun fetchImageForItem(@Path("farm") farm: Int, @Path("server") server: String, @Path("id") id: String, @Path("secret") secret: String)
}