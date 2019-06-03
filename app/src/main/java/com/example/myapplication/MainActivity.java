package com.example.myapplication;

import android.content.Intent;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button buttonAudio;
    Button buttonVideo;
    Button buttonCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Boton de audio
        buttonAudio = findViewById(R.id.btnAudio);
        buttonAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), AudioActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //Botono de Video
        buttonVideo = findViewById(R.id.btnVideo);
        buttonVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), VideoActivity.class);
                startActivityForResult(intent, 0);
            }
        });

        //Boton de Camara
        buttonCamera = findViewById(R.id.btnCamera);
        buttonCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Camera.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}
