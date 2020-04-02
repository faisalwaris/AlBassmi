package com.taxi.albassmi.ui.activity

import androidx.appcompat.app.AppCompatActivity

/**
 * Base class for all the activities
 * It will provide the basic functionality of activity
 */
abstract class BaseActivity: AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        initializeUiElements();
        setUpListener();
    }

    //it will setup listener of view
    abstract fun setUpListener()

    //it will initialize ui element of view
    abstract fun initializeUiElements()

}