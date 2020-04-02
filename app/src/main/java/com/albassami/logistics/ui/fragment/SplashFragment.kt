package com.albassami.logistics.ui.fragment

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.albassami.logistics.R
import com.albassami.logistics.util.Constant

class SplashFragment : BaseFragment() {

    private lateinit var mHandler: Handler

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun initializeUiElements(view: View) {
        mHandler = Handler()

        startSplashTimer()
    }

    override fun setUpListeners() {
    }

    private fun startSplashTimer() {
        mHandler.postDelayed({
            //move to login fragment
            view?.findNavController()
                ?.navigate(R.id.action_splashFragment_to_homeRegistrationFragment)
        }, Constant.SPLASH_TIMER)
    }

    override fun onStop() {
        super.onStop()
        mHandler.removeCallbacks(null)
    }
}