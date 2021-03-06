
package com.albassami.logistics.viewModel

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.albassami.logistics.R

class SignInViewModel: ViewModel() {

    var email: String? = null
    var password: String? = null

    fun signIn(view: View){
        view.findNavController().navigate(R.id.action_signInFragment_to_nav_home_fragment)
    }

    fun forgotPassword(view: View){
        view.findNavController().navigate(R.id.action_signInFragment_to_forgotPassword)
    }

    fun signUp(view: View){
        view.findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
    }
}