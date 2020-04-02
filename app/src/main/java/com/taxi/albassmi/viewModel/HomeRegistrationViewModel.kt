package com.taxi.albassmi.viewModel

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.taxi.albassmi.R

class HomeRegistrationViewModel: ViewModel() {

    fun signIn(view: View){
        view?.findNavController()?.navigate(R.id.action_homeRegistrationFragment_to_signInFragment)
    }

    fun signUp(view:View){
        view?.findNavController()?.navigate(R.id.action_homeRegistrationFragment_to_signUpFragment)
    }
}