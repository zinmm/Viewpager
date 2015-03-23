package com.example.viewpager.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.viewpager.R;

public class LaunchUIFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_selection_launch,
				container, false);

		LinearLayout ll = (LinearLayout) rootView.findViewById(R.id.layout);
		for (int i = 0; i < 10; i++) {
			Button button = new Button(rootView.getContext());
			button.setText("BUTTON" + i);
			ll.addView(button);
		}
		return rootView;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
	}

}
