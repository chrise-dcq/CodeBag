package com.codebag.code.mycode.view.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.codebag.R;
import com.codebag.bag.CaseListView;
import com.codebag.bag.Entry;

public class BitmapConfigInvoker extends CaseListView {

	
	
	public BitmapConfigInvoker(Context context) {
		super(context);
		
	}

	@Entry
	public void alpha_8() {
		Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sysclear_card_anim_fan);
		mBitmap = mBitmap.copy(Config.ALPHA_8, false);
		ImageView view = new ImageView(getContext());
		view.setImageBitmap(mBitmap);
		showView(view);
	}
	
	@Entry
	public void rgb_565() {
		Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sysclear_card_anim_fan);
		mBitmap = mBitmap.copy(Config.RGB_565, false);
		ImageView view = new ImageView(getContext());
		view.setImageBitmap(mBitmap);
		showView(view);
	}
	
	@Entry
	public void argb_4444() {
		Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sysclear_card_anim_fan);
		mBitmap = mBitmap.copy(Config.ARGB_4444, false);
		ImageView view = new ImageView(getContext());
		view.setImageBitmap(mBitmap);
		showView(view);
	}
	
	@Entry
	public void argb_8888() {
		Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sysclear_card_anim_fan);
		mBitmap = mBitmap.copy(Config.ARGB_8888, false);
		ImageView view = new ImageView(getContext());
		view.setImageBitmap(mBitmap);
		showView(view);
	}
	
}
