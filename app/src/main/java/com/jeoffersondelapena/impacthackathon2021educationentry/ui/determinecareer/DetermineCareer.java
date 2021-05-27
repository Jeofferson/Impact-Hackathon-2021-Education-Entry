package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.repository.QuestionRepository;

public class DetermineCareer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determine_career);

        Toast.makeText(this, String.valueOf(QuestionRepository.getQuestions().size()), Toast.LENGTH_SHORT).show();
    }
}