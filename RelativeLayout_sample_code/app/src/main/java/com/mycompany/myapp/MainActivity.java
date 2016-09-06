package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.widget.RadioGroup.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
		//Initializing first edittext box
		EditText editTextRem = new EditText(this);
	    editTextRem.setHint(R.string.reminder);
		editTextRem.setId(1);
		RelativeLayout.LayoutParams lp1 = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		editTextRem.setLayoutParams(lp1);
		
		//Initializing second edittext box
		EditText editText1 = new EditText(this);
		editText1.setHint(R.string.editText1);
		editText1.setId(2);
		RelativeLayout.LayoutParams lp2 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		
		//Initializing third edittext box
		EditText editText2 = new EditText(this);
		editText2.setHint(R.string.editText2);
		editText2.setId(3);
		RelativeLayout.LayoutParams lp3 = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		
		lp2.addRule(RelativeLayout.BELOW,editTextRem.getId());
		lp2.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
		lp2.addRule(RelativeLayout.LEFT_OF,editText2.getId());
		editText1.setLayoutParams(lp2);
		
		editText2.setLayoutParams(lp3);
		lp3.addRule(RelativeLayout.BELOW, editTextRem.getId());
		lp3.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
		editText2.setLayoutParams(lp3);
		
		
		//Initializing relative layout
		RelativeLayout relativeLayout = new  RelativeLayout(this);
		LayoutParams lp4 = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		relativeLayout.setLayoutParams(lp4);
		
		relativeLayout.addView(editTextRem);
		relativeLayout.addView(editText1);
		relativeLayout.addView(editText2);
		
		setContentView(relativeLayout);
    }
}
