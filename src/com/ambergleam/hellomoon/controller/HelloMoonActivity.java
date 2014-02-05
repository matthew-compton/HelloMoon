package com.ambergleam.hellomoon.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

public class HelloMoonActivity extends FragmentActivity {

	protected Fragment createFragment() {
		return new HelloMoonFragment();
	}

}
