package com.mycompany.fragmentrestoretest;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	/**Called when addFrag button is pressed  */
	public void addFrag(View view){
		//
		Toast.makeText(getApplicationContext(), "msg",Toast.LENGTH_SHORT).show();
    }
}
