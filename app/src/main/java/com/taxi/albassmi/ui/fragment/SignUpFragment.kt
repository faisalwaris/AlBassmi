package com.taxi.albassmi.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.taxi.albassmi.R
import com.taxi.albassmi.databinding.FragmentSignUpBinding
import com.taxi.albassmi.viewModel.SignUpViewModel

class SignUpFragment : BaseFragment() {

    private lateinit var mSignUpViewModel: SignUpViewModel

    private lateinit var mBindingView: FragmentSignUpBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBindingView = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_sign_up,
            container,
            false
        )
        mSignUpViewModel = ViewModelProvider(this)
            .get(SignUpViewModel::class.java)
        mBindingView.lifecycleOwner = activity
        mBindingView.viewModel = mSignUpViewModel
        return mBindingView.root
    }

    override fun initializeUiElements(view: View) {
        mBindingView.actionBar.tvActionbarTitle.text = getString(R.string.sign_up)

        mBindingView.tvSignin.text = HtmlCompat.fromHtml(
            resources.getString(R.string.already_have_an_account_sign_in),
            HtmlCompat.FROM_HTML_MODE_LEGACY
        )
    }

    override fun setUpListeners() {
    }
}