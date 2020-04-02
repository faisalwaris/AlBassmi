package com.taxi.albassmi.viewModel

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.taxi.albassmi.R

class SignUpViewModel : ViewModel() {


    fun signUp(view: View) {

    }

    fun signIn(view: View) {
        view.findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
    }
}