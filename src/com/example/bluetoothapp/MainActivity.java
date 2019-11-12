package com.example.bluetoothapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.bluetooth.BluetoothAdapter;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity 
{
	Button btn;
	 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn=(Button)findViewById(R.id.button1);
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				BluetoothAdapter ba=BluetoothAdapter.getDefaultAdapter();
				AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);
				if(ba==null)
				{
					ab.setTitle("Bluetooth is not supported");
					ab.setPositiveButton("OK", null);
					ab.show();
				}
				else
				{
					
				 if(ba.isEnabled())
				 {
					ab.setTitle("Bluetooth:OFF");
					ab.setPositiveButton("OK", null);
					ab.show();
					}
				 else
				 {
					ab.setTitle("Bluetooth:On");
					ab.setPositiveButton("OK", null);
					ab.show();
					}
				}
					
				
			}
		});
	}
}
