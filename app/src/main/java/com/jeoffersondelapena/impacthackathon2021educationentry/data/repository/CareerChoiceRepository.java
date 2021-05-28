package com.jeoffersondelapena.impacthackathon2021educationentry.data.repository;

import com.jeoffersondelapena.impacthackathon2021educationentry.R;
import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.CareerChoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CareerChoiceRepository {
    public static List<CareerChoice> careerChoices = new ArrayList<>(Arrays.asList(
            new CareerChoice("Graphic Design", R.drawable.graphic_design),
            new CareerChoice("Criminal Justice & Restorative Justice", R.drawable.criminal_justice_and_restorative_justice),
            new CareerChoice("Public Health", R.drawable.public_health),
            new CareerChoice("American Sign Language Education", R.drawable.american_sign_language_education),
            new CareerChoice("History", R.drawable.history),
            new CareerChoice("Peace, Justice & Conflict Studies", R.drawable.peace_justice_and_conflict_studies),
            new CareerChoice("Sustainability Studies", R.drawable.sustainability_studies),
            new CareerChoice("Sustainable Food Systems", R.drawable.sustainable_food_systems),
            new CareerChoice("Environmental & Marine Science", R.drawable.environmental_and_marine_science),
            new CareerChoice("Molecular Biology/Biochemistry", R.drawable.molecular_biology_biochemistry),
            new CareerChoice("Chemistry", R.drawable.chemistry),
            new CareerChoice("Biology", R.drawable.biology),
            new CareerChoice("Nursing", R.drawable.nursing),
            new CareerChoice("Exercise Science", R.drawable.exercise_science),
            new CareerChoice("Psychology", R.drawable.psychology),
            new CareerChoice("Social Work", R.drawable.social_work),
            new CareerChoice("Bible and Religion", R.drawable.bible_and_religion),
            new CareerChoice("Physical Education", R.drawable.physical_education),
            new CareerChoice("Elementary Education", R.drawable.elementary_education),
            new CareerChoice("Secondary Education", R.drawable.secondary_education),
            new CareerChoice("TESOL", R.drawable.tesol),
            new CareerChoice("Spanish", R.drawable.spanish),
            new CareerChoice("Sign Language Interpreting", R.drawable.sign_language_interpreting),
            new CareerChoice("Sociology", R.drawable.sociology),
            new CareerChoice("English", R.drawable.english),
            new CareerChoice("Writing", R.drawable.writing),
            new CareerChoice("Journalism", R.drawable.journalism),
            new CareerChoice("Public Relations", R.drawable.public_relations),
            new CareerChoice("Broadcasting", R.drawable.broadcasting),
            new CareerChoice("Film Production", R.drawable.film_production),
            new CareerChoice("Theater", R.drawable.theater),
            new CareerChoice("Music", R.drawable.music),
            new CareerChoice("Art", R.drawable.art),
            new CareerChoice("Communication", R.drawable.communication),
            new CareerChoice("Marketing", R.drawable.marketing),
            new CareerChoice("Business", R.drawable.business),
            new CareerChoice("Sport Management", R.drawable.sport_management),
            new CareerChoice("Sustainability Management", R.drawable.sustainability_management),
            new CareerChoice("Accounting", R.drawable.accounting),
            new CareerChoice("Engineering Physics", R.drawable.engineering_physics),
            new CareerChoice("Physics", R.drawable.physics),
            new CareerChoice("Mathematics", R.drawable.mathematics),
            new CareerChoice("Computer Science", R.drawable.computer_science),
            new CareerChoice("Information Technology", R.drawable.information_technology)
    ));

    public static List<CareerChoice> getFilteredSortedCareerChoices() {
        List<CareerChoice> filteredCareerChoices = new ArrayList<>();

        for (CareerChoice careerChoice: careerChoices) {
            if (careerChoice.score > 0) {
                filteredCareerChoices.add(careerChoice);
            }
        }
        Collections.sort(filteredCareerChoices, (o1, o2) -> Double.compare(o2.score, o1.score));

        return filteredCareerChoices;
    }

    public static List<CareerChoice> getSortedCareerChoices() {
        Collections.sort(careerChoices, (o1, o2) -> Double.compare(o2.score, o1.score));
        return careerChoices;
    }
}
