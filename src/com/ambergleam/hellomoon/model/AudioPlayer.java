package com.ambergleam.hellomoon.model;

import android.content.Context;
import android.media.MediaPlayer;

import com.ambergleam.hellomoon.R;

public class AudioPlayer extends MediaPlayer {

	private MediaPlayer mPlayer;
	private int mLength;
	private boolean mPaused;

	public void stop() {
		if (mPlayer != null) {
			mPlayer.release();
			mPlayer = null;
		}
	}

	public void resume() {
		mPaused = false;
		mPlayer.seekTo(mLength);
		mPlayer.start();
	}

	public void pause() {
		mPaused = true;
		mPlayer.pause();
		mLength = mPlayer.getCurrentPosition();
	}

	public void play(Context c) {
		stop();

		mPlayer = MediaPlayer.create(c, R.raw.one_small_step);

		mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mp) {
				stop();
			}
		});

		mPlayer.start();
	}

	public boolean isPaused() {
		return mPaused;
	}

}
