package it.univpm.auh.osmcsv;

import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        mapView = new MapView(this, 256);
        mapView.setClickable(true);
        mapView.setBuiltInZoomControls(true);
 
        mapView.getController().setZoom(10);
        mapView.getController().setCenter(new GeoPoint(39.461078, 2.856445));
 
        setContentView(mapView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
