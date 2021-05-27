package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.Question;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.repository.QuestionRepository;

public class DetermineCareer extends AppCompatActivity {

    private int currentIndex;

    private RecyclerView recyclerViewCareerChoices;
    private TextView lblQuestionContent;
    private Button btnYes;
    private Button btnNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determine_career);

        recyclerViewCareerChoices = findViewById(R.id.recycler_view_career_choices);
        lblQuestionContent = findViewById(R.id.lbl_question_content);
        btnYes = findViewById(R.id.btn_yes);
        btnNo = findViewById(R.id.btn_no);

        btnYes.setOnClickListener(v -> {
            updateCurrentIndex();
        });
        btnNo.setOnClickListener(v -> {
            updateCurrentIndex();
        });

        resetCurrentIndex();
    }

    private void resetCurrentIndex() {
        currentIndex = 0;
        updateUi();
    }

    private void updateCurrentIndex() {
        if (currentIndex >= (QuestionRepository.questions.size() - 1)) {
            currentIndex = QuestionRepository.questions.size() - 1;
        } else {
            currentIndex++;
        }
        updateUi();
    }

    private void updateUi() {
        Question currentQuestion = QuestionRepository.questions.get(currentIndex);
        lblQuestionContent.setText(currentQuestion.questionContent);
    }
}