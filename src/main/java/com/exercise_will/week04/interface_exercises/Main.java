package com.exercise_will.week04.interface_exercises;

public class Main {

    public static void main(String[] args) {

        PersonDAO personDAO = new PersonFileDB();
        PersonService personService = new PersonService(personDAO);

        System.out.println(personService.getPeople());

        System.out.println(personDAO.getPersonById(1));

    }
}
