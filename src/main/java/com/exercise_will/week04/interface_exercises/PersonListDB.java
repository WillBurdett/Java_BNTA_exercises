package com.exercise_will.week04.interface_exercises;

import java.util.ArrayList;
import java.util.List;

public class PersonListDB implements PersonDAO{

    List<Person> allPeople = new ArrayList<>();

    public PersonListDB() {
        allPeople.add(new Person(1,"Tom",45));
        allPeople.add(new Person(2,"Ryan",43));
        allPeople.add(new Person(3,"Christina",47));
    }

    @Override
    public void savePerson(Person person) {
        allPeople.add(person);
    }

    @Override
    public void deletePerson(int id) {
        allPeople.remove(getPersonById(id));
    }

    @Override
    public List<Person> getPeople() {
        return allPeople;
    }

    @Override
    public Person getPersonById(int id) {
        for (Person p : allPeople) {
            if (id == p.getId()) {
                return p;
            }
        }
        return null;
    }
}
