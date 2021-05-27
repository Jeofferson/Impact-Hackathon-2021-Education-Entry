package com.jeoffersondelapena.impacthackathon2021educationentry.data.repository;

import com.jeoffersondelapena.impacthackathon2021educationentry.data.model.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuestionRepository {
    public static List<Question> questions = new ArrayList<>(Arrays.asList(
            new Question(
                    "I have a strong interest and ability in visual art.",
                    new ArrayList<>(Arrays.asList(
                            "Art", "Film Production", "Graphic Design"
                    ))
            ),
            new Question(
                    "I'm interested in graphic and/or Web design.",
                    new ArrayList<>(Arrays.asList(
                            "Computer Science", "Information Technology", "Art", "Communication", "Graphic Design"
                    ))
            ),
            new Question(
                    "I'm interested in intellectual ideas, including those that are philosophical or religious.",
                    new ArrayList<>(Arrays.asList(
                            "Bible and Religion", "English", "History", "Sociology", "Peace, Justice & Conflict Studies", "Writing"
                    ))
            ),
            new Question(
                    "I enjoy performing as an actor, or working behind the scenes on theatrical productions.",
                    new ArrayList<>(Arrays.asList(
                            "Theater", "Film Production", "Broadcasting"
                    ))
            ),
            new Question(
                    "I like to sing and/or play musical instruments.",
                    new ArrayList<>(Arrays.asList(
                            "Music"
                    ))
            ),
            new Question(
                    "I enjoy learning about how the human body and natural world work.",
                    new ArrayList<>(Arrays.asList(
                            "Biology", "Chemistry", "Environmental & Marine Science", "Molecular Biology/Biochemistry", "Nursing", "Sustainable Food Systems"
                    ))
            ),
            new Question(
                    "I enjoy learning about languages.",
                    new ArrayList<>(Arrays.asList(
                            "English", "History", "Spanish", "TESOL", "Sign Language Interpreting"
                    ))
            ),
            new Question(
                    "I like to experiment with better and faster ways of doing things.",
                    new ArrayList<>(Arrays.asList(
                            "Chemistry", "Computer Science", "Mathematics", "Molecular Biology/Biochemistry", "Physics", "Information Technology", "Engineering Physics"
                    ))
            ),
            new Question(
                    "I enjoy working with people, and I have strong verbal and written communication skills.",
                    new ArrayList<>(Arrays.asList(
                            "Broadcasting", "Communication", "Elementary Education", "Secondary Education", "English", "Film Production", "Journalism", "Marketing", "Public Relations", "Sport Management"
                    ))
            ),
            new Question(
                    "I like math and figuring out how things work.",
                    new ArrayList<>(Arrays.asList(
                            "Physics", "Mathematics", "Computer Science", "Engineering Physics"
                    ))
            ),
            new Question(
                    "I'm interested in law, debate, government, and politics.",
                    new ArrayList<>(Arrays.asList(
                            "History", "Peace, Justice & Conflict Studies", "Sociology"
                    ))
            ),
            new Question(
                    "I enjoy helping people.",
                    new ArrayList<>(Arrays.asList(
                            "Sign Language Interpreting", "Elementary Education", "Secondary Education", "Nursing", "Peace, Justice & Conflict Studies", "Social Work", "TESOL", "Bible and Religion"
                    ))
            ),
            new Question(
                    "I'm good with numbers and am detail-oriented.",
                    new ArrayList<>(Arrays.asList(
                            "Accounting", "Business", "Sustainability Management", "Mathematics"
                    ))
            ),
            new Question(
                    "I especially love working with children.",
                    new ArrayList<>(Arrays.asList(
                            "Elementary Education", "Physical Education"
                    ))
            ),
            new Question(
                    "I'm very ambitious, persuasive, and love coming up with my own ideas.",
                    new ArrayList<>(Arrays.asList(
                            "Business", "Marketing", "Sustainability Management", "Sport Management"
                    ))
            ),
            new Question(
                    "I'm concerned about the state of the environment and want to work to improve it.",
                    new ArrayList<>(Arrays.asList(
                            "Environmental & Marine Science", "Sustainability Management", "Sustainability Studies", "Sustainable Food Systems"
                    ))
            ),
            new Question(
                    "I enjoy learning about different parts of the world.",
                    new ArrayList<>(Arrays.asList(
                            "History", "Peace, Justice & Conflict Studies", "Sociology", "Sustainability Studies", "Journalism"
                    ))
            ),
            new Question(
                    "I'm interested in science and enjoy helping people.",
                    new ArrayList<>(Arrays.asList(
                            "Exercise Science", "Nursing", "Psychology", "Molecular Biology/Biochemistry", "Sustainability Studies", "Sustainable Food Systems"
                    ))
            ),
            new Question(
                    "I need the freedom to be creative and express myself.",
                    new ArrayList<>(Arrays.asList(
                            "Art", "Film Production", "Theater", "Music", "Writing", "Graphic Design"
                    ))
            ),
            new Question(
                    "I am interested in helping bodies heal and rehabilitate.",
                    new ArrayList<>(Arrays.asList(
                            "Exercise Science", "Physical Education", "Molecular Biology/Biochemistry", "Nursing"
                    ))
            ),
            new Question(
                    "I am interested in conflict resolution, criminal justice or mediation.",
                    new ArrayList<>(Arrays.asList(
                            "Peace, Justice & Conflict Studies", "Psychology", "Sociology"
                    ))
            ),
            new Question(
                    "I want to work with people on the margins of society or who have been oppressed.",
                    new ArrayList<>(Arrays.asList(
                            "Sign Language Interpreting", "Peace, Justice & Conflict Studies", "Social Work", "TESOL", "Psychology", "Criminal Justice & Restorative Justice", "Public Health", "American Sign Language Education"
                    ))
            ),
            new Question(
                    "I'm interested in technology and learning how computers work.",
                    new ArrayList<>(Arrays.asList(
                            "Computer Science", "Information Technology"
                    ))
            ),
            new Question(
                    "I like to work with my hands and be outdoors.",
                    new ArrayList<>(Arrays.asList(
                            "Sustainable Food Systems", "Environmental & Marine Science", "Engineering Physics", "Art", "Sustainability Studies"
                    ))
            ),
            new Question(
                    "I am always reading a book or writing my own stories.",
                    new ArrayList<>(Arrays.asList(
                            "English", "Journalism", "History", "Writing", "Communication"
                    ))
            ),
            new Question(
                    "I like to offer advice to others.",
                    new ArrayList<>(Arrays.asList(
                            "Psychology", "Social Work", "Bible and Religion", "Elementary Education", "Sustainability Management"
                    ))
            )
    ));
}
