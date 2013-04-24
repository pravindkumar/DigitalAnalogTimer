package com.example.digitalanalog;

import com.pravind.digitalanalog.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class digital extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digital);
        Button one=(Button) findViewById(R.id.button2);
        one.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent intent1=new Intent (digital.this,DigiAna.class);
				startActivity(intent1);
				
				
			}
		});
    }

}
