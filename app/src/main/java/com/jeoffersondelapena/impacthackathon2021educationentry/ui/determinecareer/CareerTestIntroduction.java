package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.util.NavigationManager;

public class CareerTestIntroduction extends AppCompatActivity {
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_test_introduction);
        btnNext = findViewById(R.id.btn_next);
        btnNext.setOnClickListener(v -> onBtnNextClicked());
    }

    private void onBtnNextClicked() {
        NavigationManager.goToActivity(CareerTestIntroduction.this, DetermineCareer.class, false);
    }
}