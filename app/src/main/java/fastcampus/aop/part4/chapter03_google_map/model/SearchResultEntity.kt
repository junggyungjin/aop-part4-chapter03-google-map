package fastcampus.aop.part4.chapter03_google_map.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchResultEntity(
    val fullAdress: String,
    val name: String,
    val locationLation: LocationLatingEntity
): Parcelable