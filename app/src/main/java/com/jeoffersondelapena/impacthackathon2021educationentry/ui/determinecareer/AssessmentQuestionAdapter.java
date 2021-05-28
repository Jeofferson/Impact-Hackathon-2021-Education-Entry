package com.jeoffersondelapena.impacthackathon2021educationentry.ui.determinecareer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;

import java.util.List;

public class AssessmentQuestionAdapter extends RecyclerView.Adapter<AssessmentQuestionAdapter.AssessmentQuestionViewHolder> {
    private List<String> assessmentQuestions;

    public AssessmentQuestionAdapter(List<String> assessmentQuestions) {
        this.assessmentQuestions = assessmentQuestions;
    }

    @NonNull
    @Override
    public AssessmentQuestionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_assessment_question, parent, false);
        return new AssessmentQuestionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AssessmentQuestionViewHolder holder, int position) {
        String assessmentQuestion = assessmentQuestions.get(position);
        holder.lblAssessmentQuestionContent.setText(assessmentQuestion);
    }

    @Override
    public int getItemCount() {
        return assessmentQuestions.size();
    }

    public class AssessmentQuestionViewHolder extends RecyclerView.ViewHolder {
        private TextView lblAssessmentQuestionContent;
        public AssessmentQuestionViewHolder(View itemView) {
            super(itemView);
            lblAssessmentQuestionContent = itemView.findViewById(R.id.lbl_assessment_question_content);
        }
    }
}
