package com.google.kohastaffinterface;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckoutActivity extends Activity {
	/** Called upon creation. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkout);
        
       coListener();
    }
	
	private void coListener() {
		 final EditText mEdit = (EditText) findViewById(R.id.bcfield);
	        
	        final Button submit = (Button) findViewById(R.id.button1);
	        submit.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
//					Log.v("bcfield", mEdit.getText().toString());
					int barcode = Integer.parseInt(mEdit.getText().toString()); // I want to get the barcode from the input as an int
					Toast.makeText(getApplicationContext(), barcode, Toast.LENGTH_SHORT);
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
		coListener();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
}
