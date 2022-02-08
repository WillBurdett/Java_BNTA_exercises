package com.exercise_will.week04.exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class Exercise2_CountsOccurrences_Test {

    @Test
    void canReturnOccurrenceCount(){
        // given
        Exercise2 exercise2 = new Exercise2();
        String[] input = {"b","a", "b"};
        // when
        Map<String, Integer> actual = exercise2.howManyOccurrences(input);
        // then
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void ignoresEmptyStrings(){
        // given
        Exercise2 exercise2 = new Exercise2();
        String[] input = {"b","a", "b", "", ""};
        // when
        Map<String, Integer> actual = exercise2.howManyOccurrences(input);
        // then
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void ignoresEmptyWhiteSpaces(){
        // given
        Exercise2 exercise2 = new Exercise2();
        String[] input = {"b","a", "b", "   ", "  ", "hello world"};
        // when
        Map<String, Integer> actual = exercise2.howManyOccurrences(input);
        // then
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 2);
        expected.put("hello world", 1);
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void canHandleNullInput(){
        // given
        Exercise2 exercise2 = new Exercise2();
        String[] input = null;
        // then
        assertThatThrownBy(() -> { exercise2.howManyOccurrences(input); }) // look up AssertJ
                // Then
                .hasMessage("input was null");
    }
    @Test
    void canHandleNullsInTheInputArray(){
        // given
        Exercise2 exercise2 = new Exercise2();
        String[] input = {null, "b","a", "b", null};
        // when
        Map<String, Integer> actual = exercise2.howManyOccurrences(input);
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 2);
        // then
        assertThat(actual).isEqualTo(expected);
    }
}