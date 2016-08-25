package com.example.android.trivialdrivesample;

import android.app.Application;
import android.preference.PreferenceManager;

import io.piano.android.api.PianoClient;

public class PianoInAppBillingSampleApplication extends Application {

    private PianoClient pianoClient;

    public PianoClient getPianoClient() {
        return pianoClient;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        pianoClient = new PianoClient(this, BuildConfig.PIANO_AID, BuildConfig.DEBUG);
        pianoClient.setAccessToken(PreferenceManager.getDefaultSharedPreferences(this).getString("accessToken", null));
    }
}
