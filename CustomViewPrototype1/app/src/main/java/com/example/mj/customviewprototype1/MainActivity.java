package com.example.mj.customviewprototype1;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private boolean viewButtonToggle = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//to remove title bar
        setContentView(R.layout.activity_main);
    }

    public void setViewButtonToggle(View view){
        ImageButton button = (ImageButton) view;
        int icon;

        if(viewButtonToggle) {
            viewButtonToggle = false;
            icon = R.drawable.ic_view_quilt_white_48dp;
        }else{
            viewButtonToggle = true;
            icon = R.drawable.ic_view_stream_white_48dp;
        }

        //button.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), icon));
        button.setBackgroundResource(icon);
    }
	
	public void createBulletList(View view){
		Intent intent = new Intent(this, BulletListActivity.class);
		startActivity(intent);
	}
}
