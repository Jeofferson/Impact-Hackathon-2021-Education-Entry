package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.repository.AssessmentQuestionRepository;
import com.jeoffersondelapena.impacthackathon2021educationentry.util.NavigationManager;

public class TakeAssessmentTest extends AppCompatActivity {
    private RecyclerView recyclerViewAssessmentQuestions;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_assessment_test);
        recyclerViewAssessmentQuestions = findViewById(R.id.recycler_view_assessment_questions);
        btnNext = findViewById(R.id.btn_next);

        recyclerViewAssessmentQuestions.setAdapter(
                new AssessmentQuestionAdapter(AssessmentQuestionRepository.assessmentQuestions)
        );
        btnNext.setOnClickListener(v -> onBtnNextClicked());
    }

    private void onBtnNextClicked() {
        NavigationManager.goToActivity(TakeAssessmentTest.this, AssessmentTestResult.class, false);
        finish();
    }
}