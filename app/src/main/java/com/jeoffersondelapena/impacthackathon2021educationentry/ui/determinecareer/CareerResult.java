package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.CareerChoice;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.repository.CareerChoiceRepository;
import com.jeoffersondelapena.impacthackathon2021educationentry.ui.MainActivity;
import com.jeoffersondelapena.impacthackathon2021educationentry.util.NavigationManager;

public class CareerResult extends AppCompatActivity {
    private TextView lblResult;
    private Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_result);
        lblResult = findViewById(R.id.lbl_result);
        btnDone = findViewById(R.id.btn_done);

        btnDone.setOnClickListener(v -> onBtnDoneClicked());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            CareerChoice careerChoice = CareerChoiceRepository.getCareerChoices().get(i);
            result.append(String.format("%d. ", i + 1));
            result.append(careerChoice.careerChoiceName);
            result.append("\n");
        }

        lblResult.setText(result);
    }

    private void onBtnDoneClicked() {
        NavigationManager.goToActivity(CareerResult.this, MainActivity.class, true);
    }
}