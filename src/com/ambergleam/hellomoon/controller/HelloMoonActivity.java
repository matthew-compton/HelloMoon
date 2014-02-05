package com.ambergleam.hellomoon.controller;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.ambergleam.hellomoon.R;

public class HelloMoonActivity extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_moon);
	}
}
