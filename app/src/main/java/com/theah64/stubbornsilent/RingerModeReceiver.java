package com.theah64.stubbornsilent;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.util.Log;
import android.widget.Toast;

public class RingerModeReceiver extends BroadcastReceiver {

    private static final String X = RingerModeReceiver.class.getSimpleName();

    public RingerModeReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Log.d(X, "Ringer mode changed");

        final AudioManager am = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        if (am.getRingerMode() != AudioManager.RINGER_MODE_SILENT) {
            //Setting as silent
            Log.d(X, "Ringer mode changed to slient");
            am.setRingerMode(AudioManager.RINGER_MODE_SILENT);
        }
    }
}
