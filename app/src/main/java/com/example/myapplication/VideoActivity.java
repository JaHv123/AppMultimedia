package com.example.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnPlay;
    private Button btnPause;
    private Button btnStop;
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        video = findViewById(R.id.videoView);
        String path = "android.resource://" + getPackageName()
                + "/" + R.raw.got_simpson;

        video.setVideoURI(Uri.parse(path));

        btnPlay= findViewById(R.id.videoPlay);
        btnPause= findViewById(R.id.videoPause);
        btnStop= findViewById(R.id.videoStop);

        btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnPause.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.videoPlay:
                //Iniciamos el video
                video.start();
                break;
            case R.id.videoPause:
                //Pausamos el video
                video.pause();
                break;
            case R.id.videoStop:
                //Paramos el video y volvemos a inicializar
                video.suspend();
                video.seekTo(0);
                video.resume();
                video.pause();
                break;

        }
    }
}
