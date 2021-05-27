package com.jeoffersondelapena.impacthackathon2021educationentry.data.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question {
    public static final Double SCORE_CHANGE_AMOUNTS_DEFAULT = .2;
    public static final List<Double> SCORE_CHANGE_AMOUNTS = new ArrayList<>(Arrays.asList(
            1.3, .8, .6, .4, .3, .25
    ));

    public String questionContent;
    public ArrayList<String> careerChoices;

    public Question(String questionContent, ArrayList<String> careerChoices) {
        this.questionContent = questionContent;
        this.careerChoices = careerChoices;
    }
}
