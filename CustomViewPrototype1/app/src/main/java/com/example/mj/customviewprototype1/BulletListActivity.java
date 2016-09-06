package com.example.mj.customviewprototype1;
import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.support.v7.widget.*;
import android.support.v7.app.*;
import android.view.*;
import android.graphics.drawable.*;
import android.support.v4.content.*;
import android.graphics.*;


public class BulletListActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_bullet_list);
		Toolbar bulletListToolbar = (Toolbar)findViewById(R.id.bulletlist_toolbar);
		setSupportActionBar(bulletListToolbar);
		ActionBar ab = getSupportActionBar();
		ab.setDisplayHomeAsUpEnabled(true);
		ab.setTitle("");
		
		//change up icon color
		Drawable upArrow = getResources().getDrawable(R.drawable.abc_ic_ab_back_material);
		upArrow.setColorFilter(getResources().getColor(R.color.material_grey_600), PorterDuff.Mode.SRC_ATOP);
		
		ab.setHomeAsUpIndicator(upArrow);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this method
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.bulletlist_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	
}
