package com.albassami.logistics.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.albassami.logistics.R
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.android.synthetic.main.fragment_door_lock.*

class DoorLockFragment: BaseFragment(), View.OnClickListener, OnMapReadyCallback {

    private var mGoogleMap: GoogleMap? = null

    private lateinit var mapView: MapView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.fragment_door_lock,container,false)
        mapView = view.findViewById(R.id.map_fragment)
        mapView.onCreate(savedInstanceState)

        mapView.onResume()
        try{
            MapsInitializer.initialize(activity?.applicationContext)
        }catch (e: Exception){
            e.printStackTrace()
        }
        mapView.getMapAsync(this)

        return view
    }

    override fun initializeUiElements(view: View) {

    }

    override fun setUpListeners() {
    }

    override fun onClick(v: View?) {

    }

    override fun onMapReady(googleMap: GoogleMap?) {
        mGoogleMap = googleMap
        var latlng = LatLng(17.385044,78.486671)
        mGoogleMap?.addMarker(MarkerOptions().position(latlng).title("i am here"))
        mGoogleMap?.moveCamera(CameraUpdateFactory.newLatLng(latlng))
    }

}