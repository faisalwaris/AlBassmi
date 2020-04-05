package com.albassami.logistics.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.albassami.logistics.R
import kotlinx.android.synthetic.main.fragment_door_lock.*

class DoorLockFragment: BaseFragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_door_lock,container,false)
    }
    override fun initializeUiElements(view: View) {

    }

    override fun setUpListeners() {
        textView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        view?.findNavController()?.navigate(R.id.action_doorLockFragment_to_maintenanceFragment)
    }
}