package com.ample.vinayakabuilders;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Locations extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        // Add a marker in Ranchi and move the camera
        LatLng morabadi = new LatLng(23.394505, 85.335358);
        googleMap.addMarker(new MarkerOptions().position(morabadi).title("Ratan Heights"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(morabadi));

        LatLng mumbai = new LatLng(19.233690, 72.973423);
        googleMap.addMarker(new MarkerOptions().position(mumbai).title("RajVilas Hawa Mahal"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(mumbai));

        LatLng middle = new LatLng(23.630436, 79.519983);

        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(middle,5.0f));
    }
}
