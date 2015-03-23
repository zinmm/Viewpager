package com.example.viewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.viewpager.view.CommonUIFragment;
import com.example.viewpager.view.LaunchUIFragment;
import com.example.viewpager.view.SpecialUIFragment;

public class MyAdapter extends FragmentPagerAdapter {
	private Context mContext;
	public MyAdapter(FragmentManager fm, Context c) {
		super(fm);
		
		mContext = c;
	}
	@Override
	public Fragment getItem(int arg) {
		Fragment ft = null;
		switch (arg) {
		case 0:
			ft = new LaunchUIFragment();
			break;
		case 2:
			ft = new SpecialUIFragment(mContext);
			break;
		default:
			ft = new CommonUIFragment();

			Bundle args = new Bundle();
			ft.setArguments(args);
			break;
		}
		return ft;
	}

	@Override
	public int getCount() {
		return 6;
	}

}
