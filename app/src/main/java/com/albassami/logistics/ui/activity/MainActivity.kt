package com.albassami.logistics.ui.activity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.albassami.logistics.R
import kotlinx.android.synthetic.main.activity_home.*

class MainActivity: BaseActivity() {
    private var previousFragmentSelected: String? = null

    private var currentFragmentSelected: String? = null

    private lateinit var homeNavGraph: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
    override fun initializeUiElements() {
        currentFragmentSelected = getString(R.string.doorLockFragment)
        previousFragmentSelected = getString(R.string.doorLockFragment)
        homeNavGraph = findNavController(R.id.home_fragment)

        //need to manually set each view with navigation controller
        Navigation.setViewNavController(container_door_look,homeNavGraph)
        Navigation.setViewNavController(container_maintenance,homeNavGraph)
        Navigation.setViewNavController(container_battery,homeNavGraph)
        Navigation.setViewNavController(container_gas,homeNavGraph)
        Navigation.setViewNavController(container_oil,homeNavGraph)
        Navigation.setViewNavController(container_tire,homeNavGraph)
        Navigation.setViewNavController(container_towing,homeNavGraph)
    }

    override fun setUpListener() {
    }

     fun bottomSheetSelected(view: View){
        //update text
        unSelectText(tv_towing)
        unSelectText(tv_tire)
        unSelectText(tv_oil)
        unSelectText(tv_gas)
        unSelectText(tv_battery)
        unSelectText(tv_maintenance)
        unSelectText(tv_door_lock)

        //update image
        unSelectImage(img_towing)
        unSelectImage(img_tire)
        unSelectImage(img_oil)
        unSelectImage(img_gas)
        unSelectImage(img_battery)
        unSelectImage(img_maintenance)
        unSelectImage(img_door_look)

        var toSelectText: TextView? = null
        var toSelectImg: ImageView? = null
        var targetFragment: String? = null

        when(view?.id){
            R.id.container_door_look ->{
                toSelectText = tv_door_lock
                toSelectImg = img_door_look
                targetFragment = "doorLockFragment"
            }
            R.id.container_maintenance ->{
                toSelectText = tv_maintenance
                toSelectImg = img_maintenance
                targetFragment = "maintenanceFragment"
            }
            R.id.container_battery ->{
                toSelectText = tv_battery
                toSelectImg = img_battery
                targetFragment = "batteryFragment"
            }
            R.id.container_gas ->{
                toSelectText = tv_gas
                toSelectImg = img_gas
                targetFragment = "gasFragment"
            }
            R.id.container_oil ->{
                toSelectText = tv_oil
                toSelectImg = img_oil
                targetFragment = "oilFragment"
            }
            R.id.container_tire ->{
                toSelectText = tv_tire
                toSelectImg = img_tire
                targetFragment = "tireFragment"
            }
            R.id.container_towing ->{
                toSelectText = tv_towing
                toSelectImg = img_towing
                targetFragment = "towingFragment"
            }
        }
        toSelectText?.let {
            selectText(it)
            selectImage(toSelectImg!!)
            moveToTargetFragment(view,"action_${previousFragmentSelected}_to_${targetFragment}")
            previousFragmentSelected = targetFragment
        }
    }


    private fun unSelectText(textView: TextView){
        textView.setTextColor(ContextCompat.getColor(this,android.R.color.black))
    }

    private fun unSelectImage(img:ImageView){
        img.setColorFilter(ContextCompat.getColor(this,android.R.color.black))
    }

    private fun selectText(textView: TextView){
        textView.setTextColor(ContextCompat.getColor(this,android.R.color.white))
    }

    private fun selectImage(img:ImageView){
        img.setColorFilter(ContextCompat.getColor(this,android.R.color.white))
    }

    private fun moveToTargetFragment(view: View?, actionName: String){
        var action = resources.getIdentifier(actionName,"id",packageName)
        view?.findNavController()?.navigate(action)
    }

}