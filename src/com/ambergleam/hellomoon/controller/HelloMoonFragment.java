package com.ambergleam.hellomoon.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.ambergleam.hellomoon.R;
import com.ambergleam.hellomoon.model.AudioPlayer;

public class HelloMoonFragment extends Fragment {

	private Button mPlayButton, mPauseButton, mStopButton;

	private AudioPlayer mPlayer = new AudioPlayer();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false);

		mPlayButton = (Button) v.findViewById(R.id.hellomoon_playButton);
		mPlayButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mPlayer.play(getActivity());
			}
		});

		mPauseButton = (Button) v.findViewById(R.id.hellomoon_pauseButton);
		mPauseButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mPlayer.isPaused()) {
					mPlayer.resume();
				} else {
					mPlayer.pause();
				}
				updatePauseButton();
			}
		});
		
		mStopButton = (Button) v.findViewById(R.id.hellomoon_stopButton);
		mStopButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mPlayer.stop();
			}
		});

		updatePauseButton();
		
		return v;
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		mPlayer.stop();
	}
	
	private void updatePauseButton() {
		if (mPlayer.isPaused()) {
			mPauseButton.setText(R.string.hellomoon_resume);
		} else {
			mPauseButton.setText(R.string.hellomoon_pause);
		}
	}

}
