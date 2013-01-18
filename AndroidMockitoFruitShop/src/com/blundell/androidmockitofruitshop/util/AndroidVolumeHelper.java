package com.blundell.androidmockitofruitshop.util;

import android.media.AudioManager;

public class AndroidVolumeHelper {

	public void maximizeVolume(AudioManager audioManager) {
		if (audioManager.getRingerMode() != AudioManager.RINGER_MODE_SILENT) {
			int max = audioManager.getStreamMaxVolume(AudioManager.STREAM_RING);
			audioManager.setStreamVolume(AudioManager.STREAM_RING, max, 0);
		}
	}

}
