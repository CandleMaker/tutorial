package com.example.mj.customviewprototype1;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;


/**
 * Created by MichaelJoseph on 7/15/2016.
 */
public class sampleCustomView extends View {
    //constructor
    private ShapeDrawable mDrawable;

    public sampleCustomView(Context context, AttributeSet attrs){
        super(context,attrs);
    }
}
