package com.example.login_register_mvvm_retrofit.data.model.modelresponse


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import java.io.Serializable

@Keep
data class User(
    @SerializedName("date_joined")
    val dateJoined: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("groups")
    val groups: List<Any>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_staff")
    val isStaff: Boolean,
    @SerializedName("is_superuser")
    val isSuperuser: Boolean,
    @SerializedName("last_login")
    val lastLogin: String,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("phone")
    val phone: String,
    @SerializedName("user_permissions")
    val userPermissions: List<Any>,
    @SerializedName("user_type")
    val userType: String,
    @SerializedName("username")
    val username: String
): Serializable