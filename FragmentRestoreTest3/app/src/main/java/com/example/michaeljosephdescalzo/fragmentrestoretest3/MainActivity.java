package com.example.michaeljosephdescalzo.fragmentrestoretest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Respond to add Fragment button */
    public void addFrag(View view){
        Toast.makeText(getApplicationContext(), "button test",Toast.LENGTH_SHORT).show();

        //Initialize textView
        TextView textView = new TextView(this);
        textView.setText("hello");
        textView.setTextSize(22);

        //Setup FrameLayout parameters
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        textView.setLayoutParams(lp);

        //Initialize Framelayout
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));

        //Add views
        linearLayout.addView(textView);

        //Get parent container
        LinearLayout rl =(LinearLayout)findViewById(R.id.fragment_container);
        rl.addView(linearLayout);
    }

}
