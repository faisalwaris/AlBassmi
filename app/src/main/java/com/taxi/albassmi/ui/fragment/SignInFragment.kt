package com.taxi.albassmi.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.taxi.albassmi.R
import com.taxi.albassmi.databinding.FragmentSignInBinding
import com.taxi.albassmi.viewModel.SignInViewModel

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