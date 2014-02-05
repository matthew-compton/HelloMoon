package com.ambergleam.hellomoon.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ambergleam.hellomoon.R;

public class HelloMoonFragment extends Fragment {

	private Button mPlayButton, mStopButton; 
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false);
		
		mPlayButton = (Button)v.findViewById(R.id.hellomoon_playButton);
		mStopButton = (Button)v.findViewById(R.id.hellomoon_stopButton);
		
		return v;
	}
	
}
