package com.codingwithmitch.openapi.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

// room persistence Entity class
// AND retrofit response class for the account properties this is why we need the annotations Expose and serializedname

@Entity(tableName = "account_properties")
data class AccountProperties(

    @SerializedName("pk") // for retrofit
    @Expose // for retrofit
    @PrimaryKey(autoGenerate = false) // for room
    @ColumnInfo(name = "pk")// for room
    var pk: Int,

    @SerializedName("email") // for retrofit
    @Expose // for retrofit
    @ColumnInfo(name = "email")// for room
    var email: String,

    @SerializedName("username") // for retrofit
    @Expose // for retrofit
    @ColumnInfo(name = "username")// for room
    var username: String

)