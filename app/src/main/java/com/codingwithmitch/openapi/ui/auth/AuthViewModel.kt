package com.codingwithmitch.openapi.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.codingwithmitch.openapi.api.auth.network_responses.LoginResponse
import com.codingwithmitch.openapi.api.auth.network_responses.RegistrationResponse
import com.codingwithmitch.openapi.repository.auth.AuthRepository
import com.codingwithmitch.openapi.util.GenericApiResponse
import javax.inject.Inject

class AuthViewModel
@Inject
constructor(
    val authRepository: AuthRepository
) : ViewModel() {

    fun testLogin(): LiveData<GenericApiResponse<LoginResponse>> {
        return authRepository.testLoginRequest(
            "pierre.bouriat@outlook.fr",
            "1234azer"
        )
    }

    fun testRegister(): LiveData<GenericApiResponse<RegistrationResponse>> {
        return authRepository.testRegistrationRequest(
            "pierre.bouriat@outlook.fr",
            "sicarti",
            "1234azer",
            "1234azer"
        )
    }
}