package com.jeoffersondelapena.impacthackathon2021educationentry.ui;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.ui.checkmentalhealth.CheckMentalHealth;
import com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer.DetermineCareer;
import com.jeoffersondelapena.impacthackathon2021educationentry.util.NavigationManager;

public class MainActivity extends AppCompatActivity {
    // Change the 'Button' here if you will change the activity_main.xml file's widget type for
    // these IDs
    private Button choiceDetermineCareer;
    private Button choiceCheckMentalHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        choiceDetermineCareer = findViewById(R.id.choice_determine_career);
        choiceCheckMentalHealth = findViewById(R.id.choice_check_mental_health);

        choiceDetermineCareer.setOnClickListener(v -> onChoiceDetermineCareerClicked());
        choiceCheckMentalHealth.setOnClickListener(v -> onChoiceCheckMentalHealthClicked());
    }

    private void onChoiceDetermineCareerClicked() {
        NavigationManager.goToActivity(MainActivity.this, DetermineCareer.class, false);
    }

    private void onChoiceCheckMentalHealthClicked() {
        NavigationManager.goToActivity(MainActivity.this, CheckMentalHealth.class, false);
    }
}