package com.exercise_will.week04.interface_exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

class PersonServiceTest {
    private PersonDAO personDAO;
    private PersonService underTest;

    @BeforeEach
    void setUp() {

        // TODO: create a mock for personDAO
        personDAO = Mockito.mock(PersonDAO.class);
        // TODO: create an instance of underTest and pass personDAO into it;
        underTest = new PersonService(personDAO);
    }

    /*
        TODO: Test all these methods.
        You might need to create additional methods. Check test coverage
    */

    //    Good luck :)

    @Test
    void itCanSavePerson() {
        // Given
        Person person = new Person(2, "Mark", 25);

        // When
        underTest.savePerson(person);

        // Then
        verify(personDAO).savePerson(person);
    }

    @Test
    void itCanDeletePerson() {
        // Given
        List<Person> testPeople = new ArrayList<>();
        testPeople.add(new Person(2, "Mark", 25));
        given(personDAO.getPeople()).willReturn(testPeople);

        // When
        underTest.deletePerson(2);

        // Then
        verify(personDAO).deletePerson(2);
    }

    @Test
    void canGetPeopleFromDB() {
        // Given
        List<Person> testPeople = new ArrayList<>();
        testPeople.add(new Person(2, "Mark", 25));
        given(personDAO.getPeople()).willReturn(testPeople);

        // When
        List<Person> actual = underTest.getPeople();

        // Then
        List<Person> expected = List.of(new Person(2, "Mark", 25));
        verify(personDAO).getPeople();
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canGetPersonById() {
        // Given
        List<Person> testPeople = new ArrayList<>();
        Person expected = new Person(2, "Mark", 25);
        testPeople.add(expected);
        given(personDAO.getPeople()).willReturn(testPeople);

        // When
        Person actual = underTest.getPersonById(2).get();

        // Then
        assertThat(actual).isEqualTo(expected);
    }
}