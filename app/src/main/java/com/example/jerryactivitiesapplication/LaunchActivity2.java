package com.example.jerryactivitiesapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

@SuppressLint("CustomSplashScreen")
public class LaunchActivity2 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_launch2);

        ImageButton back = findViewById(R.id.backButton);

        back.setOnClickListener(view -> {
            Intent intent = new Intent(LaunchActivity2.this, FormActivity2.class);
            startActivity(intent);

            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });


    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Jerry Activity 1", Toast.LENGTH_SHORT).show();
    }


}