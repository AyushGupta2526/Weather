package com.example.weather.features.weatherforecast.data.models.autocomplete


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AutocompleteItem(
    @Json(name = "country")
    val country: String?,
    @Json(name = "id")
    val id: Int?,
    @Json(name = "lat")
    val lat: Double?,
    @Json(name = "lon")
    val lon: Double?,
    @Json(name = "name")
    val name: String?,
    @Json(name = "region")
    val region: String?,
    @Json(name = "url")
    val url: String?
)