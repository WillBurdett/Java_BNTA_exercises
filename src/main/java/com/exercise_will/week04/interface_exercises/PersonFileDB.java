package com.exercise_will.week04.interface_exercises;

import com.exercise_will.week02.day2.classes_files_exercises.Exercise1.Person1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonFileDB implements PersonDAO{

    File file = new File("/Users/williamburdett/Desktop/Intellij/IdeaProjects/BNTA_updated/src/main/java/com/exercise_will/week04/interface_exercises", "PersonDB.txt");

    @Override
    public void savePerson(Person person) {
        // Read file to list. Append person. Write list to file (.StringCSV)
        List<Person> updated = new ArrayList<>();
        for (Person p : updated) {
                updated.add(p);
            }
        updated.add(person);
        try {
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter myWriter = new PrintWriter(fileWriter);
            for (Person p : updated) {
                myWriter.println(p.toStringCSV());
            }

            myWriter.flush();
            myWriter.close();

            System.out.println(updated);

        } catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }
    }

    @Override
    public void deletePerson(int id) {
        // This solution may not be optimal or pretty, but it works. It reads in an input file line by line, writing each line out to a temporary output file.
        List<Person> updated = new ArrayList<>();
        for (Person person : updated) {
            if (id == person.getId()){
                continue;
            } else {
                updated.add(person);
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter myWriter = new PrintWriter(fileWriter);
            for (Person person : updated) {
                myWriter.println(person.toStringCSV());
            }

            myWriter.flush();
            myWriter.close();

            System.out.println(updated);

        } catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }
    }

    @Override
    public List<Person> getPeople() {
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

        List<Person> allPeople = new ArrayList<>();
        for (int i = 0; i < personData.size(); i++) {
            String[] eachData =  personData.get(i).split(",");
            Person person = new Person(Integer.parseInt(eachData[0]), eachData[1], Integer.parseInt(eachData[2]));
            allPeople.add(person);
        }
        return allPeople;
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }
}
