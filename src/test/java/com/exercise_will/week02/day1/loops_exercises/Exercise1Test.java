package com.exercise_will.week02.day1.loops_exercises;

import com.exercise_will.week03.day1.garage_classes_exercises.Car;
import com.exercise_will.week03.day1.garage_classes_exercises.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat; // make sure to import this
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

class Exercise1Test {

    private Exercise1 underTest;

    @BeforeEach
    void setUp() {
        underTest = new Exercise1();   // right-click generate > setUp
    }
    //   this is the same as 'Exercise1 exercise1 = new Exercise1();



    @Test
    void canReverseString() {
        // Given
        String input = "hello";

        // When
        String actual = underTest.reverseStr("hello");

        // Then
        String expected = "olleh";
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void exampleMock(){

        // WITHOUT MOCK
        Person will = new Person("Will", 26, "will@gmail.com", new Car[0]);

        System.out.println(will.getName());


        // WITH MOCK
         Person marcy = Mockito.mock(Person.class);
         String name = marcy.getName();
         System.out.println(name);
        // prints null as you've not told it what to do

        // rather than going to a db
        given(marcy.getName()).willReturn("Hello");
        System.out.println(marcy.getName());

        // -----------------------



        // sets ages
        marcy.setAge(24);
        // checks that the age is set to 24
        given(marcy.getAge()).willReturn(24);

        // VERIFY
        // verifies that setAge was called with 24 (the value it should have)
        verify(marcy).setAge(24);

        // this is testing that a method was called with a certain value
        // e.g. if you wanted to addFlight(), this would normally want to save to file.
        // but you'd like to verify saveToFile() was called with a certain value
    }
}