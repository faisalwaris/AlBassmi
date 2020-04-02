package com.taxi.albassmi.viewModel

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.taxi.albassmi.R

class SignInViewModel: ViewModel() {

    var email: String? = null
    var password: String? = null

    fun signIn(view: View){
    }

    fun forgotPassword(view: View){
        view.findNavController().navigate(R.id.action_signInFragment_to_forgotPassword)
    }

    fun signUp(view: View){
        view.findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
    }
}