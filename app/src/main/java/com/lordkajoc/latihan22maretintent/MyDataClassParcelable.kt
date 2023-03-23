package com.lordkajoc.latihan22maretintent

import android.os.Parcel
import android.os.Parcelable


data class MyDataClassParcelable(
    var name: String?,
    var email:String?,
    var phone: String?,
    var address:String?,
    var age: String?,
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(email)
        parcel.writeString(phone)
        parcel.writeString(address)
        parcel.writeString(age)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MyDataClassParcelable> {
        override fun createFromParcel(parcel: Parcel): MyDataClassParcelable {
            return MyDataClassParcelable(parcel)
        }

        override fun newArray(size: Int): Array<MyDataClassParcelable?> {
            return arrayOfNulls(size)
        }
    }
}