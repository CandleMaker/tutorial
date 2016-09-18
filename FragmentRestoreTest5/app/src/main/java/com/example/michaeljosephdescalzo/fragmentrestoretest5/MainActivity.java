package com.example.michaeljosephdescalzo.fragmentrestoretest5;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DBClass dbClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dbClass = new DBClass(this);
        setContentView(R.layout.activity_main);
    }

    public int initFrameContainer(){
        //Initialize FrameLayout
        FrameLayout.LayoutParams flp = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.WRAP_CONTENT);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setLayoutParams(flp);
        int viewId = View.generateViewId();
        frameLayout.setId(viewId);

        //Get parent container
        LinearLayout ll = (LinearLayout)findViewById(R.id.fragment_container);
        ll.addView(frameLayout);

        return viewId;
    }

    public void addFragText(View view){
        addFragTextMethod("add");
    }

    public void addFragTextMethod(String purpose){
        int viewId = initFrameContainer();

        //Store record in database
        if(purpose.equals("add")){
            dbClass.insertView(viewId, "text", "hello");
        }

        //Add fragment
        TextFragment textFragment = new TextFragment();
        getSupportFragmentManager().beginTransaction().add(viewId, textFragment).commit();
    }

    public void addFragButton(View view){
        addFragButtonMethod("add");
    }

    public void addFragButtonMethod(String purpose){
        int viewId = initFrameContainer();

        //Store record in database
        if(purpose.equals("add")){
            dbClass.insertView(viewId, "button", "button");
        }


        //Add fragment
        ButtonFragment buttonFragment = new ButtonFragment();
        getSupportFragmentManager().beginTransaction().add(viewId, buttonFragment).commit();
    }

    public void countAll(View view){
        Toast.makeText(getApplicationContext(), dbClass.countAll().toString(), Toast.LENGTH_SHORT).show();
    }

    public void deleteAll(View view){
        dbClass.deleteAll();
    }

    public void removeAll(View view){
        LinearLayout ll = (LinearLayout)findViewById(R.id.fragment_container);
        ll.removeAllViews();
    }

    public void restoreAll(View view){
        int viewCount = dbClass.countAll();
        Cursor res = dbClass.getAllData();
        res.moveToFirst();
        String type = "";

        for(int i = 0; i < viewCount; i++){
            type = res.getString(2);

            if(type.equals("text")){
                addFragTextMethod("restore");
            }else{
                addFragButtonMethod("restore");
            }
            res.moveToNext();
        }
    }
}
