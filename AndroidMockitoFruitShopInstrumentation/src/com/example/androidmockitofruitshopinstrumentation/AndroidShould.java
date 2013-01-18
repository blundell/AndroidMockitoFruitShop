package com.example.androidmockitofruitshopinstrumentation;

import static org.mockito.MockitoAnnotations.initMocks;

import android.media.AudioManager;
import android.test.InstrumentationTestCase;

import com.blundell.androidmockitofruitshop.util.AndroidVolumeHelper;

import org.mockito.Mock;
import org.mockito.Mockito;

public class AndroidShould extends InstrumentationTestCase {

	@Mock
	AudioManager mockAudioManager;

	public void test_something() {
		// 1. Prepare mocks and script their behavior.
		initMocks(this);
		Mockito.when(mockAudioManager.getRingerMode()).thenReturn(AudioManager.RINGER_MODE_SILENT);

		// 2. Test the code of interest.
		new AndroidVolumeHelper().maximizeVolume(mockAudioManager);

		// 3. Validate that we saw exactly what we wanted.
		Mockito.verify(mockAudioManager).getRingerMode();
		Mockito.verifyNoMoreInteractions(mockAudioManager);
	}

}
