package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.CareerChoice;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.repository.CareerChoiceRepository;
import com.jeoffersondelapena.impacthackathon2021educationentry.ui.MainActivity;
import com.jeoffersondelapena.impacthackathon2021educationentry.util.AlertDialogManager;
import com.jeoffersondelapena.impacthackathon2021educationentry.util.NavigationManager;

import java.util.ArrayList;
import java.util.List;

public class CareerResult extends AppCompatActivity implements CareerChoiceAdapter.OnItemClickListener {
    private RecyclerView recyclerViewCareerChoices;
    private Button btnDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_result);
        recyclerViewCareerChoices = findViewById(R.id.recycler_view_career_choices);
        btnDone = findViewById(R.id.btn_done);

        btnDone.setOnClickListener(v -> onBtnDoneClicked());

        List<CareerChoice> filteredCareerChoices = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            filteredCareerChoices.add(CareerChoiceRepository.getSortedCareerChoices().get(i));
        }
        recyclerViewCareerChoices.setAdapter(
                new CareerChoiceAdapter(
                        filteredCareerChoices,
                        CareerResult.this,
                        true
                )
        );
    }

    @Override
    public void onBackPressed() {
        AlertDialogManager.showAlertDialogBuilder(
                CareerResult.this,
                "Leave page?",
                "Your answers will not be saved."
        ).setPositiveButton(
                "Leave",
                (dialog, which) -> NavigationManager.goToActivity(CareerResult.this, MainActivity.class, true)
        ).setNegativeButton("No", null)
                .show();
    }

    @Override
    public void onBtnTakeAssessmentTestClicked(CareerChoice careerChoice) {
        NavigationManager.goToActivity(CareerResult.this, TakeAssessmentTest.class, false);
    }

    @Override
    public void onBtnWatchAVideoClicked(CareerChoice careerChoice) {
        NavigationManager.goToActivity(CareerResult.this, WatchAVideo.class, false);
    }

    private void onBtnDoneClicked() {
        NavigationManager.goToActivity(CareerResult.this, MainActivity.class, true);
    }
}