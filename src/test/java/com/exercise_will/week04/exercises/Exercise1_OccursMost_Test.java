package com.exercise_will.week04.exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class Exercise1_OccursMost_Test {

    @Test
    void canReturnMostOccurring(){
        // given
        Exercise1 exercise1 = new Exercise1();
        String[] input = {"a", "a", "b", "c", "c", "c", "d"};
        // when
        List <String> actual = exercise1.occursMost(input);
        // then
        List<String> expected = Arrays.asList("c");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canReturnMultipleMostOccurring(){
        // given
        Exercise1 exercise1 = new Exercise1();
        String[] input = {"a", "a", "b", "b"};
        // when
        List <String> actual = exercise1.occursMost(input);
        // then
        List<String> expected = Arrays.asList("a", "b");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canReturnMostOccurringIfInputIsAllTheSame(){
        // given
        Exercise1 exercise1 = new Exercise1();
        String[] input = {"a", "a", "a", "a", "a", "a"};
        // when
        List <String> actual = exercise1.occursMost(input);
        // then
        List<String> expected = Arrays.asList("a");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleNullsInTheInput(){
        // given
        Exercise1 exercise1 = new Exercise1();
        String[] input = {null, "a", "a", "b"};
        // when
        List <String> actual = exercise1.occursMost(input);
        // then
        List<String> expected = Arrays.asList("a");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canHandleANullInput(){
        // given
        Exercise1 exercise1 = new Exercise1();
        String[] input = null;
        // when
        assertThatThrownBy(() -> { exercise1.occursMost(input); }) // look up AssertJ
                // Then
                .hasMessage("input was null");
    }

    @Test
    void ignoresEmptyStrings(){
        // given
        Exercise1 exercise1 = new Exercise1();
        String[] input = {"", "", "b"};
        // when
        List <String> actual = exercise1.occursMost(input);
        // then
        List<String> expected = Arrays.asList("b");
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void ignoresEmptyWhiteSpaces(){
        // given
        Exercise1 exercise1 = new Exercise1();
        String[] input = {"  ", "    ", "hello you"};
        // when
        List <String> actual = exercise1.occursMost(input);
        // then
        List<String> expected = Arrays.asList("hello you");
        assertThat(actual).isEqualTo(expected);
    }

}