package com.example.mad_practical8_095

import android.app.Service
import android.content.Intent
import android.media.AsyncPlayer
import android.media.MediaPlayer
import android.os.IBinder

class AlarmService : Service() {
    lateinit var player: MediaPlayer
    override fun onBind(intent: Intent): IBinder {
        return TODO("this is a Alarm")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
       if(intent != null){
           player= MediaPlayer.create(this,R.raw.alarm)
       }
        return START_STICKY
    }

    override fun onDestroy() {
        player.stop()
        super.onDestroy()
    }
}
