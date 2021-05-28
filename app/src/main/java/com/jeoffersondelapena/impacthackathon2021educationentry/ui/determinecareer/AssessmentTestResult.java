package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;

public class AssessmentTestResult extends AppCompatActivity {
    private Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assessment_test_result);
        btnDone = findViewById(R.id.btn_done);
        btnDone.setOnClickListener(v -> finish());
    }
}