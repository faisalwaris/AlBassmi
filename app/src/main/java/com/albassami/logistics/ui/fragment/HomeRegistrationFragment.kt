package com.albassami.logistics.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.albassami.logistics.R
import com.albassami.logistics.databinding.FragmentHomeRegistrationBinding
import com.albassami.logistics.viewModel.HomeRegistrationViewModel

class HomeRegistrationFragment : BaseFragment() {

    private lateinit var mBindingView: FragmentHomeRegistrationBinding

    private lateinit var mHomeRegistrationModel: HomeRegistrationViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBindingView = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_home_registration,
            container,
            false
        )
        mHomeRegistrationModel = ViewModelProvider(this)
            .get(HomeRegistrationViewModel::class.java)
        mBindingView.lifecycleOwner = this
        mBindingView.viewModel = mHomeRegistrationModel

        return mBindingView.root
    }

    override fun initializeUiElements(view: View) {

    }

    override fun setUpListeners() {
    }
}