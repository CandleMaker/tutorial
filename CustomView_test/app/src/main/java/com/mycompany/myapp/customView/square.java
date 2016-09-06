package com.mycompany.myapp.customView;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.os.Build;
import android.util.AttributeSet;
import android.view.*;
import android.widget.Scroller;

import com.mycompany.myapp.R;

import java.lang.Math;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class square extends ViewGroup
{
	public square(Context context, AttributeSet attrs){
		super(context, attrs);
	}
	
	@Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        // no action yet
    }
	
}
