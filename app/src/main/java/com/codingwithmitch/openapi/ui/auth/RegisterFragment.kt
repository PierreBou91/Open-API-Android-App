package com.codingwithmitch.openapi.ui.auth

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import androidx.lifecycle.Observer
import android.view.View
import android.view.ViewGroup
import com.codingwithmitch.openapi.R
import com.codingwithmitch.openapi.util.GenericApiResponse
import com.codingwithmitch.openapi.util.GenericApiResponse.*

class RegisterFragment : BaseAuthFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(TAG, "RegisterFragment: ${viewModel.hashCode()}")

        viewModel.testRegister().observe(viewLifecycleOwner, Observer { response ->
            when (response) {
                is ApiSuccessResponse -> {
                    Log.d(TAG, "REGISTRATION RESPONSE: ${response.body}")
                }
                is ApiErrorResponse -> {
                    Log.d(TAG, "REGISTRATION RESPONSE: ${response.errorMessage}")
                }
                is ApiEmptyResponse -> {
                    Log.d(TAG, "REGISTRATION RESPONSE: empty response")
                }
            }
        })
    }

}