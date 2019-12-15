package edu.upb.googlemapsmarcadores;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
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
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        LatLng marcador1 = new LatLng(-16.524747, -68.110466);
        mMap.addMarker(new MarkerOptions().position(marcador1).title("UPB Postgrado La Paz"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marcador1,16));


        LatLng marcador2 = new LatLng(-16.504075,-68.131108);
        mMap.addMarker(new MarkerOptions().position(marcador2).title("Plaza del Estudiante"));

        LatLng marcador3 = new LatLng(-16.541895,-68.091507);
        mMap.addMarker(new MarkerOptions().position(marcador3).title("Plaza Humbold"));

        LatLng marcador4 = new LatLng(-16.527980,-68.105893);
        mMap.addMarker(new MarkerOptions().position(marcador4).title("Plaza de la Loba"));

        LatLng marcador5 = new LatLng(-16.574821, -68.126706);
        mMap.addMarker(new MarkerOptions().position(marcador5).title("UPB Campus"));

        LatLng marcador6 = new LatLng(-16.510419, -68.126382);
        mMap.addMarker(new MarkerOptions().position(marcador6).title("Plaza Avaroa"));

        LatLng marcador7 = new LatLng(-16.499493, -68.122691);
        mMap.addMarker(new MarkerOptions().position(marcador7).title("Estadio Hernando Siles"));

        LatLng marcador8 = new LatLng(-16.514280,-68.128396);
        mMap.addMarker(new MarkerOptions().position(marcador8).title("Plaza España"));
    }
}
