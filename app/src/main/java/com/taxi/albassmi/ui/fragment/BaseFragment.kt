package com.taxi.albassmi.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeUiElements(view)
        setUpListeners()
    }

    abstract fun initializeUiElements(view: View)

    abstract fun setUpListeners()
}