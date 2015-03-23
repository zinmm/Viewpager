package com.example.viewpager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements OnClickListener, OnPageChangeListener {
	
	private ViewPager viewpager;
	private RelativeLayout mRlAll, mRlNoPay, mRlNoGoods, mRlReceiptGoods,
			mRlRefund, mRlSuccess;
	private ImageView mIvAll, mIvNoPay, mIvNoGoods, mIvReceiptGoods, mIvRefund,
			mIvSuccess;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
		initDate();
	}

	private void initDate() {
		viewpager.setAdapter(new MyAdapter(getSupportFragmentManager(), getApplicationContext()));
		viewpager.setOnPageChangeListener(this);
	}

	private void initView() {
		viewpager = (ViewPager) findViewById(R.id.viewpager);
		
		mRlAll = (RelativeLayout) findViewById(R.id.order_rl_all);
		mRlNoPay = (RelativeLayout) findViewById(R.id.order_rl_nopay);
		mRlNoGoods = (RelativeLayout) findViewById(R.id.order_rl_nogoods);
		mRlReceiptGoods = (RelativeLayout) findViewById(R.id.order_rl_receiptgoods);
		mRlRefund = (RelativeLayout) findViewById(R.id.order_rl_refund);
		mRlSuccess = (RelativeLayout) findViewById(R.id.order_rl_success);

		mIvAll = (ImageView) findViewById(R.id.order_iv_all);
		mIvNoPay = (ImageView) findViewById(R.id.order_iv_nopay);
		mIvNoGoods = (ImageView) findViewById(R.id.order_iv_nogoods);
		mIvReceiptGoods = (ImageView) findViewById(R.id.order_iv_receiptgoods);
		mIvRefund = (ImageView) findViewById(R.id.order_iv_refund);
		mIvSuccess = (ImageView) findViewById(R.id.order_iv_success);

		mRlAll.setOnClickListener(this);
		mRlNoPay.setOnClickListener(this);
		mRlNoGoods.setOnClickListener(this);
		mRlReceiptGoods.setOnClickListener(this);
		mRlRefund.setOnClickListener(this);
		mRlSuccess.setOnClickListener(this);
		
		mIvAll.setVisibility(View.VISIBLE);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.order_rl_all:
			imageGone(0);
			viewpager.setCurrentItem(0);
			break;
		case R.id.order_rl_nopay:
			imageGone(1);
			viewpager.setCurrentItem(1);
			break;
		case R.id.order_rl_nogoods:
			imageGone(2);
			viewpager.setCurrentItem(2);
			break;
		case R.id.order_rl_receiptgoods:
			imageGone(3);
			viewpager.setCurrentItem(3);
			break;
		case R.id.order_rl_refund:
			imageGone(4);
			viewpager.setCurrentItem(4);
			break;
		case R.id.order_rl_success:
			imageGone(5);
			viewpager.setCurrentItem(5);
			break;
		}
	}

	private void imageGone(int point) {
		mIvAll.setVisibility(View.GONE);
		mIvNoPay.setVisibility(View.GONE);
		mIvNoGoods.setVisibility(View.GONE);
		mIvReceiptGoods.setVisibility(View.GONE);
		mIvRefund.setVisibility(View.GONE);
		mIvSuccess.setVisibility(View.GONE);
		
		switch (point) {
		case 0:
			mIvAll.setVisibility(View.VISIBLE);
			break;
		case 1:
			mIvNoPay.setVisibility(View.VISIBLE);
			break;
		case 2:
			mIvNoGoods.setVisibility(View.VISIBLE);
			break;
		case 3:
			mIvReceiptGoods.setVisibility(View.VISIBLE);
			break;
		case 4:
			mIvRefund.setVisibility(View.VISIBLE);
			break;
		case 5:
			mIvSuccess.setVisibility(View.VISIBLE);
			break;
		}
		
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int poition) {
		imageGone(poition);
	}
}
