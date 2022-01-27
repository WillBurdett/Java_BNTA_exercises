package com.exercise_will.week02.day2.classes_files_exercises.Exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    // Read the file and turn each row into objects stored in an Array of type Person.

    public static void main(String[] args) {

        String dirName = "/Users/williamburdett/Desktop/Intellij/IdeaProjects/BNTA_updated/src/com/exercise_will/week02/day2/classes_files_exercises";
        String fileName = "person_data.txt";
        // create file
        File file = new File(dirName, fileName);
        try {
           if (!file.exists()) {
               file.createNewFile();
           }
           } catch (IOException e) {
               e.printStackTrace();
        }

        // read file and add each line to a list
        List<String> personData = new ArrayList<>();
        try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            personData.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        List<Person1> allPeople = new ArrayList<>();
        for (int i = 1; i < personData.size(); i++) {
            String[] eachData =  personData.get(i).split(",");
            Person1 person = new Person1(Integer.parseInt(eachData[0]), eachData[1], eachData[2], eachData[3], eachData[4].charAt(0));
            allPeople.add(person);
        }

        Person1[] population = allPeople.toArray(new Person1[0]);

        System.out.println(Arrays.toString(population));
    }
}
