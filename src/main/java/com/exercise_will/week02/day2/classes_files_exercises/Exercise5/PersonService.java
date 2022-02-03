package com.exercise_will.week02.day2.classes_files_exercises.Exercise5;

import java.util.Scanner;

public class PersonService {

    public static void createPerson(Questionnaire questionnaire){
        System.out.println("Excellent. What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("What's your age?");
        Integer num = scanner.nextInt();

        System.out.println("Please enter 'M' for male, 'F' for female or 'o' for other:");
        String gender = scanner.next();

        System.out.println("Lastly, please enter your email:");
        String email = scanner.next();

        Person person = new Person(name, num, gender.charAt(0), email);
        System.out.println(person);

        QuestionnaireService.questions(person, questionnaire);
    }
}
