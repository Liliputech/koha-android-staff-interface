package com.google.kohastaffinterface;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	/** Called upon creation. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        /*
         * What I want to do here is get several buttons to link
         * to different activities (e.g. checkin, checkout).
         * If that's possible, that is.  There's a pretty
         * steep learning curve on Android, or so it seems.
         */
//        Button topLeft = (Button) findViewById(R.id.button_id);
        checkInListener();
        checkOutListener();
    }
	
	private void checkInListener() {
		Button ckin = (Button) findViewById(R.id.ckin);
        ckin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent goto_ckin = new Intent(view.getContext(), CheckinActivity.class);
				startActivityForResult(goto_ckin, 0); // This 0 passes whatever I want it to to my new activity.
			}
		});
	}
	
	private void checkOutListener() {
		Button ckout =  (Button) findViewById(R.id.ckout);
        ckout.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent goto_ckout = new Intent(view.getContext(), CheckoutActivity.class);
				startActivityForResult(goto_ckout, 0);
			}
		});
	}
	
	@Override
	public void onPause() {
		super.onPause();
	}
	
	@Override
	public void onStop() {
		super.onStop();
	}
	
	@Override
	public void onResume() {
		super.onResume();
		checkInListener();
		checkOutListener();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
}
