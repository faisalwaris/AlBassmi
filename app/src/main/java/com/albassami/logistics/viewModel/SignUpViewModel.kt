package com.albassami.logistics.viewModel

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.albassami.logistics.R

class SignUpViewModel : ViewModel() {


    fun signUp(view: View) {

    }

    fun signIn(view: View) {
        view.findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
    }
}