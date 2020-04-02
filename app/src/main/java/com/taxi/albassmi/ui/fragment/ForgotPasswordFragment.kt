package com.taxi.albassmi.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.taxi.albassmi.R
import com.taxi.albassmi.databinding.FragmentForgotBinding
import com.taxi.albassmi.viewModel.ForgotPasswordViewModel

class ForgotPasswordFragment : BaseFragment() {

    private lateinit var mForgotPasswordViewModel: ForgotPasswordViewModel

    private lateinit var mBindingView: FragmentForgotBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBindingView = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_forgot,
            container,
            false
        )
        mForgotPasswordViewModel = ViewModelProvider(this)
            .get(ForgotPasswordViewModel::class.java)
        mBindingView.lifecycleOwner = activity
        mBindingView.viewModel = mForgotPasswordViewModel
        return mBindingView.root
    }

    override fun initializeUiElements(view: View) {
        mBindingView.actionBar.tvActionbarTitle.text = getString(R.string.forgot_password)
    }

    override fun setUpListeners() {
    }
}