package com.example.jerryactivitiesapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class FormActivity3 extends AppCompatActivity {


    Button btnDog, btnCat, btnChick;
    Button btnMale, btnFemale;
    Button btnSmall, btnMedium, btnLarge;
    Button btnYoung, btnAdult, btnSenior;
    Button btnViewMatches;
    EditText etLocation;
    Spinner spinnerBreed;
    TextView tvClearAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_form3);

        ImageButton btnBack;



        etLocation = findViewById(R.id.etLocation);
        spinnerBreed = findViewById(R.id.spinnerBreed);

        btnDog = findViewById(R.id.btnDog);
        btnCat = findViewById(R.id.btnCat);
        btnChick = findViewById(R.id.btnChick);
        btnBack = findViewById(R.id.btnBack);

        btnMale = findViewById(R.id.btnMale);
        btnFemale = findViewById(R.id.btnFemale);

        btnSmall = findViewById(R.id.btnSmall);
        btnMedium = findViewById(R.id.btnMedium);
        btnLarge = findViewById(R.id.btnLarge);

        btnYoung = findViewById(R.id.btnYoung);
        btnAdult = findViewById(R.id.btnAdult);
        btnSenior = findViewById(R.id.btnSenior);

        btnViewMatches = findViewById(R.id.btnViewMatches);
        tvClearAll = findViewById(R.id.tvClearAll);

        btnBack.setOnClickListener(view -> {
            Intent intent = new Intent(FormActivity3.this, MainActivity.class);
            startActivity(intent);

            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });

        btnViewMatches.setOnClickListener(v ->
                Toast.makeText(this, "Filters applied", Toast.LENGTH_SHORT).show()
        );

        tvClearAll.setOnClickListener(v -> clearFilters());
    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "Jerry Activity 12", Toast.LENGTH_SHORT).show();
    }

    private void clearFilters() {
        etLocation.setText("");
        spinnerBreed.setSelection(0);
        Toast.makeText(this, "Filters cleared", Toast.LENGTH_SHORT).show();
    }

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

}