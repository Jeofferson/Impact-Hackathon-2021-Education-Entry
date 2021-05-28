package com.jeoffersondelapena.impacthackathon2021educationentry.data.model;

import com.jeoffersondelapena.impacthackathon2021educationentry.data.repository.QuestionRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CareerChoice {
    public static final double SCORE_CHANGE_AMOUNT_DEFAULT = .2;
    public static final List<Double> SCORE_CHANGE_AMOUNTS = new ArrayList<>(Arrays.asList(
            1.3, .8, .6, .4, .3, .25
    ));

    public String careerChoiceName;
    public int careerChoiceImage;
    public double score = .0;

    public CareerChoice(String careerChoiceName, int careerChoiceImage) {
        this.careerChoiceName = careerChoiceName;
        this.careerChoiceImage = careerChoiceImage;
    }

    public double getScoreChangeAmount() {
        int associatedQuestions = 0;

        for (Question question: QuestionRepository.questions) {
            for (String careerChoice: question.careerChoices) {
                if (careerChoice.equalsIgnoreCase(careerChoiceName)) {
                    associatedQuestions++;
                }
            }
        }

        if (associatedQuestions > 6) {
            return SCORE_CHANGE_AMOUNT_DEFAULT;
        } else {
            return SCORE_CHANGE_AMOUNTS.get(associatedQuestions - 1);
        }
    }
}
