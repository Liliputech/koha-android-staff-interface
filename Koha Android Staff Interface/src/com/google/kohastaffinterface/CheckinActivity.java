package com.google.kohastaffinterface;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CheckinActivity extends Activity {
	/** Called upon creation. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkin);
        
        ciListener();
    }
	
	private void ciListener() {
		Button submit =  (Button) findViewById(R.id.submit);
//      EditText bcfield = (EditText) findViewById(R.id.bcfield);
//        String barcode;
        final EditText bcfield = (EditText) findViewById(R.id.bcfield);
        
        submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
//				barcode = bcfield.getText().toString();
				Toast.makeText(getApplication(), bcfield.getText(), Toast.LENGTH_SHORT).show();
				/* I'm trying to get the value input in bcfield as a string, but it doesn't like
				 * to be a string.  I'm confused.
				 */
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
		ciListener();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
	}
}
