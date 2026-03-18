package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @DisplayName("인자 두 개를 받아서 덧셈을 수행한다")
    @Test
    void testAdd() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(1, 2);
        //then
        assertEquals(3, result);
    }

    @DisplayName("인자 두 개를 받아서 뺄셈을 수행한다")
    @Test
    void testSubtract() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.subtract(4, 2);
        //then
        assertEquals(2, result);
    }

    @DisplayName("인자 두 개를 받아서 곱셈을 수행한다")
    @Test
    void testMultiply() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.multiply(1, 2);
        //then
        assertEquals(2, result);
    }

    @DisplayName("인자 두 개를 받아서 나눗셈을 수행한다")
    @Test
    void testDivision() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.division(10, 2);
        //then
        assertEquals(5, result);
    }
}