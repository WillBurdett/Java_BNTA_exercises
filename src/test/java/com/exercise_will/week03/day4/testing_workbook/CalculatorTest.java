package com.exercise_will.week03.day4.testing_workbook;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void canAddTwoNumbers(){
        // creating an instance of the class we want to test
        Calculator calculator = new Calculator();
        // Given
        int n1 = 10;
        int n2 = 10;

        //When
        int actual = calculator.add(n1, n2);

        // Then
        int expected = 20;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canDivideTwoNumbers(){
        // Given
        Calculator calculator = new Calculator();
        double n1 = 10;
        double n2 = 10;

        // When
        double actual = calculator.divide(n1, n2);

        // Then
        double expected = 1.0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canNotDivideByZeroException(){
        // Given
        Calculator calculator = new Calculator();
        double n1 = 0.0;
        double n2 = 10.0;

        // When
        assertThatThrownBy(() -> { calculator.divide(n1, n2); }) // look up AssertJ
                // Then
                .hasMessage("Cannot divide by 0.");
    }
}