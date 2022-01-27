package com.exercise_will.week02.day2.classes_files_exercises.Exercise5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class QuestionnaireService {

        static QuestionnaireConfig questionnaireConfig = new QuestionnaireConfig();


        public static void welcome(){
                System.out.println("Welcome to my Questionnaire system!");
                System.out.println("Which survey would you like to take? (please type the number below)");
                for (int i=0; i < questionnaireConfig.questionnaires.length; i++){
                        System.out.println(i + 1 + ". "
                                + questionnaireConfig.questionnaires[i].getQuestionnaireName()
                                + " by " + questionnaireConfig.questionnaires[i].getCompanyName());
                }
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();
                try {
                        PersonService.createPerson(questionnaireConfig.questionnaires[input-1]);
                } catch (Exception e){
                        System.out.println("Invalid selection.");
                        welcome();
                }
        }

        public static void questions(Person p, Questionnaire q){
                // pathway the txt files will be stored
                String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/BNTA_updated/src/com/exercise_will/week02/day2/classes_files_exercises/Exercise5/CompletedQuestionnaires/" + q.getCompanyName().toLowerCase().replaceAll(" ", "");

                // file is named the persons email (this is a unique identifier)
                String fileName = p.getEmail() + "_" + q.getCompanyName().replaceAll(" ", "") + ".txt";

                // create file with the specified names
                File file = new File(dirName, fileName);
                try {
                        if (!file.exists()) {
                                file.createNewFile();
                        }
                } catch (IOException e) {
                        e.printStackTrace();
                }

                // write the questions and answers to the file
                try {
                        // create fileWriter with our txt file as an argument
                        FileWriter fileWriter = new FileWriter(file);
                        // create printWriter with fileWriter as argument
                        PrintWriter myWriter = new PrintWriter(fileWriter);

                        // welcome
                        myWriter.println("Welcome to the '"+ q.getQuestionnaireName() +"' survey!");
                        System.out.println("Welcome to the '"+ q.getQuestionnaireName() +"' survey!");

                        // loop through questions printing both question and answer
                        for (Object question : q.getQuestions()) {
                             myWriter.println(question);
                             System.out.println(question);
                             Scanner scanner = new Scanner(System.in);
                             String input = scanner.nextLine();
                             myWriter.println(input);
                        }

                        // end of questions
                        myWriter.flush();
                        myWriter.close();

                } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                }

                // print at the end of the survey
                System.out.println("Thank you for taking part! :)");

                q.getCompleted().add(file);

                }
}
