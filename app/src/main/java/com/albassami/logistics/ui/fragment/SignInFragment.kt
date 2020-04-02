package com.albassami.logistics.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.albassami.logistics.R
import com.albassami.logistics.databinding.FragmentSignInBinding
import com.albassami.logistics.viewModel.SignInViewModel

class SignInFragment : BaseFragment() {

    lateinit var mSignInBindingView: FragmentSignInBinding

    lateinit var mSignInViewModel: SignInViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mSignInBindingView = DataBindingUtil
            .inflate(
                inflater, R.layout.fragment_sign_in,
                container,
                false
            )
        mSignInViewModel = ViewModelProvider(this).get(SignInViewModel::class.java)
        mSignInBindingView.lifecycleOwner = activity
        mSignInBindingView.viewModel = mSignInViewModel
        return mSignInBindingView.root
    }

    override fun initializeUiElements(view: View) {
        mSignInBindingView.actionBar.tvActionbarTitle.text = getString(R.string.sign_in)
    }

    override fun setUpListeners() {

    }


}