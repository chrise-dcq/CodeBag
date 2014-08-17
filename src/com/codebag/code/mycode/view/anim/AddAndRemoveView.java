package com.codebag.code.mycode.view.anim;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.codebag.R;
import com.codebag.bag.CaseListView;
import com.codebag.bag.Entry;

public class AddAndRemoveView extends CaseListView {

	private FrameLayout container;
	
	public AddAndRemoveView(Context context) {
		super(context);
		container = new FrameLayout(context);
	}
	
	@Entry
	public void addView() {
		final ImageView iv = new ImageView(getContext());
		iv.setBackgroundResource(R.drawable.ic_launcher);
		
		Button addView = new Button(getContext());
		addView.setText("addView");
		addView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				container.addView(iv, wrapContentParams(Gravity.CENTER));
				attachAnim(iv);
			}
		});
		
		Button removeView = new Button(getContext());
		removeView.setText("removeView");
		removeView.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				detachAnim(iv);
				container.removeView(iv);
			}
		});
		
		
		container.addView(addView, wrapContentParams(Gravity.LEFT|Gravity.CENTER_VERTICAL));
		container.addView(removeView, wrapContentParams(Gravity.RIGHT|Gravity.CENTER_VERTICAL));

		showView(container);
		
		
	}
	
	private void attachAnim(View iv) {
		AnimationSet animinationSet = new AnimationSet(true);
		ScaleAnimation animationScale = new ScaleAnimation(1, 2.0f, 1, 2.0f,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
		AlphaAnimation animationAlpha = new AlphaAnimation(.3f, 1.0f); // 透明度，从不透明到透明
		animinationSet.addAnimation(animationScale);
		animinationSet.addAnimation(animationAlpha);
		animinationSet.setFillAfter(true);
		animinationSet.setDuration(2000);
		iv.clearAnimation();
		iv.startAnimation(animinationSet);
		animinationSet.setAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationEnd(Animation animation) {
				
			}

			@Override
			public void onAnimationStart(Animation animation) {
				
			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				
			}
		});
		
		iv.startAnimation(animinationSet);
	}
	
	private void detachAnim(View iv) {
		AnimationSet animinationSet = new AnimationSet(true);
		ScaleAnimation animationScale = new ScaleAnimation(2.0f, 1.0f, 2.0f, 1.0f,
				Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
		AlphaAnimation animationAlpha = new AlphaAnimation(1.0f, .3f); // 透明度，从不透明到透明
		animinationSet.addAnimation(animationScale);
		animinationSet.addAnimation(animationAlpha);
		animinationSet.setFillAfter(true);
		animinationSet.setDuration(2000);
		iv.clearAnimation();
		iv.startAnimation(animinationSet);
		animinationSet.setAnimationListener(new AnimationListener() {
			@Override
			public void onAnimationEnd(Animation animation) {
				
			}
			
			@Override
			public void onAnimationStart(Animation animation) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				
			}
		});
		
		iv.startAnimation(animinationSet);
	}
	
	
	
	

}
