package com.example.wifiipaddress;

import android.app.Activity;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				WifiManager wm = (WifiManager) getSystemService(WIFI_SERVICE);
				String ip = Formatter.formatIpAddress(wm.getConnectionInfo().getIpAddress());
				Log.d("", ""+ip+"");
			}
		});
	}

	
}
