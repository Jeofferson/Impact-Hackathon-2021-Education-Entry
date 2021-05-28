package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.CareerChoice;

public class WatchAVideo extends AppCompatActivity {
    private TextView lblCareerChoiceName;
    private TextView lblCareerChoiceDescription;
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_a_video);

        lblCareerChoiceName = findViewById(R.id.lbl_career_choice_name);
        lblCareerChoiceDescription = findViewById(R.id.lbl_career_choice_description);
        videoView = findViewById(R.id.vid_career_choice_video);

        lblCareerChoiceName.setText(CareerChoice.selectedCareerChoice.careerChoiceName);
        lblCareerChoiceDescription.setText(CareerChoice.selectedCareerChoice.getCareerChoiceDescription);
        Uri uri = Uri.parse(String.format("android.resource://%s/%s", getPackageName(), CareerChoice.selectedCareerChoice.careerChoiceVideo));
        videoView.setVideoURI(uri);
        videoView.start();
    }
}