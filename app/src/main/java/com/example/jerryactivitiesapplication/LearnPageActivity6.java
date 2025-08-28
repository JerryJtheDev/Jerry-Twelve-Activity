package com.example.jerryactivitiesapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LearnPageActivity6 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_learn_page6);

        ImageButton back = findViewById(R.id.backButton);
        ImageButton forward = findViewById(R.id.forwardButton);


        back.setOnClickListener(view -> {
            Intent intent = new Intent(LearnPageActivity6.this, LearnPageActivity5.class);
            startActivity(intent);

            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });

        forward.setOnClickListener(view -> {
            Intent intent = new Intent(LearnPageActivity6.this, LearnPageActivity7.class);
            startActivity(intent);

            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Jerry Activity 9", Toast.LENGTH_SHORT).show();
    }

}