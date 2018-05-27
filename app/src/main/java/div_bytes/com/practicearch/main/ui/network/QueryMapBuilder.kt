package div_bytes.com.practicearch.main.ui.network

import div_bytes.com.practicearch.universal.API_KEY_FLICKR

/**
 *@author div@hello.com (div-hello)
 */

const val METHOD = "method"
const val API_KEY = "api_key"
const val FORMAT = "format"
const val NO_JSON_CALLBACK = "nojsoncallback"
const val TEXT  = "text"

/**
 * Used by the Retrofit api for the API call when filtering by text
 * @param method - maps to the method that is being called on flickr
 * @param Text - maps to the text we are searching for
 *
 * @see FlickrService.listImagesByFilter this will generate the map for that method
 *
 */
fun listImagesByFilterMapBuilder(method: String, text: String): Map<String, String>
        = mapOf(METHOD to method, TEXT to text, addApiToAPIKeyPair(), addFormatJsonPair(),
        addNoJsonCallBackPair())

fun addApiToAPIKeyPair() = API_KEY to API_KEY_FLICKR

fun addFormatJsonPair() = FORMAT to "json"

fun addNoJsonCallBackPair() = NO_JSON_CALLBACK to "1"
