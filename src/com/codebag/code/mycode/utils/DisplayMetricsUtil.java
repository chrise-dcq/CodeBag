package com.codebag.code.mycode.utils;

import android.content.Context;
import android.graphics.Color;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

import com.codebag.R;
import com.codebag.bag.MyCode;
import com.codebag.bag.Entry;
import com.codebag.bag.MainActivity;
import com.codebag.code.mycode.utils.MultiViews.MyAdapter;

public class DisplayMetricsUtil extends MyCode{

	public DisplayMetricsUtil(MainActivity context) {
		super(context);
	}

	@Entry
	public void getDisplayMetrics() {
		MultiViews views = new MultiViews(getActivity(), 1);
		views.setAdapter(new MyAdapter() {
			TextView view = null;
			DisplayMetrics dm = getActivity().getResources().getDisplayMetrics();
			
			@Override
			public View getView(int position) {
				switch(position) {
				case 0:
					view = new TextView(getActivity());
					view.setText("手机型号: " + android.os.Build.MODEL);
					break;
				case 1:
					view = new TextView(getActivity());
					view.setText("SDK版本号: " + android.os.Build.VERSION.SDK_INT);
					break;
				case 2:
					view = new TextView(getActivity());
					view.setText("固件版本: " + android.os.Build.VERSION.RELEASE);
					break;
				case 3:
					view = new TextView(getActivity());
					String resolution = dm.widthPixels +" x " + dm.heightPixels;
					view.setText("分辨率: " + resolution);
					break;
				case 4:
					view = new TextView(getActivity());
					view.setText("屏幕密度: " + dm.densityDpi);
					break;
				case 5:
					view = new TextView(getActivity());
					TelephonyManager tm = (TelephonyManager) getActivity().getSystemService(Context.TELEPHONY_SERVICE);
					view.setText("IMEI: " + tm.getDeviceId());
					break;
				case 6:
				    view = new TextView(getActivity());
				    String str = getActivity().getString(R.string.values_marks);
				    view.setText("res 资源读取目录: " + str);
				}
				return view;
			}
			
			@Override
			public int getCount() {
				return 7;
			}
		});
		views.setBackgroundColor(Color.WHITE);
		showView(views);
	}
	
	
	
}
