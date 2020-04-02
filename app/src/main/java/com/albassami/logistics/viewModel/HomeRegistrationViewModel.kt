
package com.albassami.logistics.viewModel

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.albassami.logistics.R

class HomeRegistrationViewModel: ViewModel() {

    fun signIn(view: View){
        view?.findNavController()?.navigate(R.id.action_homeRegistrationFragment_to_signInFragment)
    }

    fun signUp(view:View){
        view?.findNavController()?.navigate(R.id.action_homeRegistrationFragment_to_signUpFragment)
    }
}