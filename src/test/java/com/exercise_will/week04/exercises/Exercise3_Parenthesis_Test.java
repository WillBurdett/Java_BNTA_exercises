package com.exercise_will.week04.exercises;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Exercise3_Parenthesis_Test {


    @Test
    void canMatchCorrectBrackets() {
    // given
        Exercise3 exercise3 = new Exercise3();
        String input = "[{()}]";
    // when
        boolean actual = exercise3.bracketsMatch(input);
    // then
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canFailIncorrectBrackets() {
        // given
        Exercise3 exercise3 = new Exercise3();
        String input = "[{()";
        // when
        boolean actual = exercise3.bracketsMatch(input);
        // then
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void willIgnoreNonBrackets() {
        // given
        Exercise3 exercise3 = new Exercise3();
        String input = "diodfibh,./ (dsfsgh) agh";
        // when
        boolean actual = exercise3.bracketsMatch(input);
        // then
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void canHandleNoBrackets() {
        // given
        Exercise3 exercise3 = new Exercise3();
        String input = "Hello World!";
        // when
        assertThatThrownBy(() -> { exercise3.bracketsMatch(input); }) // look up AssertJ
                // Then
                .hasMessage("No brackets in input.");
    }
    @Test
    void canHandleEmptyString() {
        // given
        Exercise3 exercise3 = new Exercise3();
        String input = "";
        // when
        assertThatThrownBy(() -> { exercise3.bracketsMatch(input); }) // look up AssertJ
                // Then
                .hasMessage("No brackets in input.");
    }
    @Test
    void canHandleNullString() {
        // given
        Exercise3 exercise3 = new Exercise3();
        String input = null;
        // when
        assertThatThrownBy(() -> { exercise3.bracketsMatch(input); }) // look up AssertJ
                // Then
                .hasMessage("Input was null.");
    }
}