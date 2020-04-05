package com.albassami.logistics.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import com.albassami.logistics.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: BaseFragment(), View.OnClickListener {

    private var previousFragmentSelected: String? = null
    private var currentFragmentSelected: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }
    override fun initializeUiElements(view: View) {
        currentFragmentSelected = getString(R.string.doorLockFragment)
        previousFragmentSelected = getString(R.string.doorLockFragment)
    }

    override fun setUpListeners() {
        container_door_look.setOnClickListener(this)
        container_maintenance.setOnClickListener(this)
        container_battery.setOnClickListener(this)
        container_gas.setOnClickListener(this)
        container_oil.setOnClickListener(this)
        container_tire.setOnClickListener(this)
        container_towing.setOnClickListener(this)
    }


    private fun bottomSheetSelected(view:View?){
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
        textView.setTextColor(ContextCompat.getColor(context!!,android.R.color.black))
    }

    private fun unSelectImage(img:ImageView){
        img.setColorFilter(ContextCompat.getColor(context!!,android.R.color.black))
    }

    private fun selectText(textView: TextView){
        textView.setTextColor(ContextCompat.getColor(context!!,android.R.color.white))
    }

    private fun selectImage(img:ImageView){
        img.setColorFilter(ContextCompat.getColor(context!!,android.R.color.white))
    }

    private fun moveToTargetFragment(view: View?, actionName: String){
/*        var homeNavGraph = R.navigation.nav_home_graph.javaClass
        var actionToMove = homeNavGraph.getDeclaredField(actionName)*/
  /*      var action = resources.getIdentifier(actionName,"id","com.albassmi.logistics")

        view?.findNavController()?.navigate(R.id.action_doorLockFragment_to_maintenanceFragment)*/
    }

    override fun onClick(v: View?) {
        bottomSheetSelected(v)
    }


}