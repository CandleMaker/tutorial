package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.widget.ActionMenuView.*;
import android.view.*;
import android.graphics.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        
		//Initializing ImageView
		ImageView imageView = new ImageView(this);
		imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
		imageView.setImageResource(R.drawable.image);
		imageView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
		LayoutParams.MATCH_PARENT));
		
		//Initializing textView1
		TextView textView1 = new TextView(this);
		textView1.setText("Fanny Hands Lane, London");
		textView1.setTextSize(22);
		textView1.setGravity(Gravity.CENTER_HORIZONTAL);
		textView1.setTextColor(Color.parseColor("#fcfcfc"));
		textView1.setBackgroundColor(Color.parseColor("#00000c"));
		textView1.setPadding(10,10,10,10);
		FrameLayout.LayoutParams lp1 = new FrameLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, Gravity.CENTER_HORIZONTAL);
		lp1.setMargins(0,20,0,0);
		textView1.setLayoutParams(lp1);
		
		//Initializing textView2
		TextView textView2 = new TextView(this);
		textView2.setTextSize(18);
		textView2.setGravity(Gravity.RIGHT|Gravity.BOTTOM);
		textView2.setText("26/Jan/2014");
		textView2.setTextColor(Color.WHITE);
		textView2.setPadding(10,10,10,10);
		textView2.setBackgroundColor(Color.BLACK);
		FrameLayout.LayoutParams lp2 = new FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT,Gravity.RIGHT|Gravity.BOTTOM);
		textView2.setLayoutParams(lp2);
	
		
		//Initializing FrameLayout
		FrameLayout frameLayout = new FrameLayout(this);
		frameLayout.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
		
		//Adding views to Framelayout
		frameLayout.addView(imageView);
		frameLayout.addView(textView1);
		frameLayout.addView(textView2);
		setContentView(frameLayout);
    }
}
