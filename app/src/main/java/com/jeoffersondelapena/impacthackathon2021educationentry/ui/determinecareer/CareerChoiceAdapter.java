package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.CareerChoice;

import java.util.List;

public class CareerChoiceAdapter extends RecyclerView.Adapter<CareerChoiceAdapter.CareerChoiceViewHolder> {
    private List<CareerChoice> careerChoices;

    public CareerChoiceAdapter(List<CareerChoice> careerChoices) {
        this.careerChoices = careerChoices;
    }

    @NonNull
    @Override
    public CareerChoiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_career_choice, parent, false);
        return new CareerChoiceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CareerChoiceViewHolder holder, int position) {
        CareerChoice careerChoice = careerChoices.get(position);
        holder.lblPosition.setText(String.format("%d.", position + 1));
//        holder.lblPosition.setText(String.valueOf(careerChoice.score));
        holder.lblCareerChoiceName.setText(careerChoice.careerChoiceName);
    }

    @Override
    public int getItemCount() {
        return careerChoices.size();
    }

    public class CareerChoiceViewHolder extends RecyclerView.ViewHolder {
        private TextView lblPosition;
        private TextView lblCareerChoiceName;
        public CareerChoiceViewHolder(View itemView) {
            super(itemView);
            lblPosition = itemView.findViewById(R.id.lbl_position);
            lblCareerChoiceName = itemView.findViewById(R.id.lbl_career_choice_name);
        }
    }
}
