package fastcampus.aop.part4.chapter03_google_map.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Parcelize는 intent로 데이터를 넘길때
 * Parcelable로 구현을 해줘야 데이터를 읽고 쓸수 있다.
 * 그런데 이제 kotlin 라이브러리에서 제공하는 기능 중 하나인데
 * 해당 데이터에 있는 프로퍼티를 알아서 읽고 쓸수 있도록 구현을 해줌
 */
@Parcelize
data class LocationLatingEntity(
    val latitude: Float,
    val longitude: Float
): Parcelable