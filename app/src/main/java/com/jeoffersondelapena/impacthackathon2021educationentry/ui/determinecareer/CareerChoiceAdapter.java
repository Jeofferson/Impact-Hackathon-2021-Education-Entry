package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.CareerChoice;

import java.util.List;

public class CareerChoiceAdapter extends RecyclerView.Adapter<CareerChoiceAdapter.CareerChoiceViewHolder> {
    private List<CareerChoice> careerChoices;
    private OnItemClickListener onItemClickListener;
    private boolean isWithButtons;

    public CareerChoiceAdapter(List<CareerChoice> careerChoices, boolean isWithButtons) {
        this.careerChoices = careerChoices;
        this.isWithButtons = isWithButtons;
    }

    public CareerChoiceAdapter(List<CareerChoice> careerChoices, OnItemClickListener onItemClickListener, boolean isWithButtons) {
        this.careerChoices = careerChoices;
        this.onItemClickListener = onItemClickListener;
        this.isWithButtons = isWithButtons;
    }

    @NonNull
    @Override
    public CareerChoiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if (!isWithButtons) {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_career_choice, parent, false);
        } else {
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_career_choice_with_buttons, parent, false);
        }
        return new CareerChoiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CareerChoiceViewHolder holder, int position) {
        CareerChoice careerChoice = careerChoices.get(position);

        holder.lblPosition.setText(String.format("%d. ", position + 1));
//        holder.lblPosition.setText(String.valueOf(careerChoice.score));
        holder.lblCareerChoiceName.setText(careerChoice.careerChoiceName);
        holder.imgCareerChoiceImage.setImageResource(careerChoice.careerChoiceImage);
    }

    @Override
    public int getItemCount() {
        return careerChoices.size();
    }

    public class CareerChoiceViewHolder extends RecyclerView.ViewHolder {
        private TextView lblPosition;
        private TextView lblCareerChoiceName;
        private ImageView imgCareerChoiceImage;

        private Button btnTakeAssessmentTest;
        private Button btnWatchAVideo;

        public CareerChoiceViewHolder(View itemView) {
            super(itemView);
            lblPosition = itemView.findViewById(R.id.lbl_position);
            lblCareerChoiceName = itemView.findViewById(R.id.lbl_career_choice_name);
            imgCareerChoiceImage = itemView.findViewById(R.id.img_career_choice_image);

            if (isWithButtons) {
                btnTakeAssessmentTest = itemView.findViewById(R.id.btn_take_assessment_test);
                btnWatchAVideo = itemView.findViewById(R.id.btn_watch_a_video);

                btnTakeAssessmentTest.setOnClickListener(v -> onBtnTakeAssessmentTestClicked());
                btnWatchAVideo.setOnClickListener(v -> onBtnWatchAVideoClicked());
            }
        }

        private void onBtnTakeAssessmentTestClicked() {
            onItemClickListener.onBtnTakeAssessmentTestClicked(careerChoices.get(getAdapterPosition()));
        }

        private void onBtnWatchAVideoClicked() {
            onItemClickListener.onBtnWatchAVideoClicked(careerChoices.get(getAdapterPosition()));
        }
    }

    public interface OnItemClickListener {
        void onBtnTakeAssessmentTestClicked(CareerChoice careerChoice);
        void onBtnWatchAVideoClicked(CareerChoice careerChoice);
    }
}
