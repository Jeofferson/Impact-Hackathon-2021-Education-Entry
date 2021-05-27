package com.jeoffersondelapena.impacthackathon2021educationentry.data.model;

import java.util.ArrayList;

public class Question {
    public String questionContent;
    public ArrayList<String> careerChoices;

    public Question(String questionContent, ArrayList<String> careerChoices) {
        this.questionContent = questionContent;
        this.careerChoices = careerChoices;
    }
}
