package com.exercise_will.week02.day2.classes_files_exercises.Exercise5;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireConfig {

        List questions1 = List.of(
                "Question 1 - How are you feeling today?",
                "Question 2 - Are you optimistic that this survey will save properly?",
                "Question 3 - On a scale of 1-10, how impressed would you be if this survey worked? (10 being the most impressed)"
        );
        List<File> completed1 = new ArrayList<>();

        Questionnaire questionnaire1 = new Questionnaire(
                1,
                LocalDate.of(2022, 01, 25),
                "BNTA",
                "Health and Optimism",
                questions1,
                completed1
        );

        List questions2 = List.of(
                "Question 1 - Can you juggle?",
                "Question 2 - How often do you catch the bus?",
                "Question 3 - How much wood could a woodchuck chuck if a woodchuck could chuck an exception?"
        );
        List<File> completed2 = new ArrayList<>();

        Questionnaire questionnaire2 = new Questionnaire(
                1,
                LocalDate.of(2022, 01, 27),
                "Amigoscode",
                "Can you catch my exception?",
                questions2,
                completed2
        );

        public Questionnaire[] questionnaires = {questionnaire1, questionnaire2};

        public static void main(String[] args) {

        }
    }

