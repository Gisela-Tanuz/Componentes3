package com.example.componentes3;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.service.controls.actions.CommandAction;

import androidx.annotation.Nullable;

public class ServicioMusical extends Service {
    private MediaPlayer mp;
    public void onCreate(){
        mp= MediaPlayer.create(this,R.raw.musica_3_1);
    }
    public int onStartCommand(Intent intent, int flags,int startId){
        mp.start();
        return START_STICKY;
    }
    public void onDestroy(){
        super.onDestroy();
        mp.stop();
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

