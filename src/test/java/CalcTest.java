import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    private static Calc calc;

    @BeforeEach
    public void setUp() {
        calc = new Calc();
    }

    @Test
    public void when10AddTo5ResultShouldBe15() {
        int expected = 10;
        int actual = calc.add(5, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void when7AddTo5ResultShouldBe12() {
        int expected = 12;
        int actual = calc.add(7, 5);
        assertEquals(expected, actual);
    }

    @Test
    public void when6AddTo5AsStringResultShouldBe11() {
        int expected = 11;
        int actual = calc.add("6", "5");
        assertEquals(expected, actual);
    }

    @Test
    public void whenInputIncorrectValueThenThrowException() {
        String expected = "java.lang.NumberFormatException: For input string: \"asd\"";
        String actual;
        try {
            int num = calc.add("asd", "g5");
        } catch (NumberFormatException e) {
            actual = e.toString();
            assertEquals(expected, actual);
        }
    }

    @Test
    public void whenInputIncorrectValueThenThrowExceptionWithBooleanVariableCompare() {
        boolean wasException = false;
        try {
            int num = calc.add("asd", "g5");
        } catch (Exception e) {
            wasException = true;
        } finally {
            assertTrue(wasException);
        }
    }

    @Test
    public void whenIncorrectInputNumsAsArgumentThenThrowExceptionMinusMethod() {

        int expected = 1;
        int actual = calc.minus(10, 9);
        assertEquals(expected, actual);

        int expected2 = 0;
        int actual2 = calc.minus(7, 7);
        assertEquals(expected2, actual2);
    }

    @Test
    public void whenInputNumsAsStringArgumentMinusMethod() {
        int expected = 1;
        int actual = calc.minus("10", "9");
        assertEquals(expected, actual);
    }

    @Test
    public void multiply() {
        double expected = 9;
        double actual = calc.multiply(3, 3);
        assertEquals(expected, actual);

        double expected1 = 18;
        double actual1 = calc.multiply(6, 3);
        assertEquals(expected1, actual1);
    }

    @Test
    public void whenInputNumsAsStringArgumentMultipleMethod() {
        double expected = 90;
        double actual = calc.multiply("10", "9");
        assertEquals(expected, actual);
    }

    @Test
    public void whenInputWithIncorrectArgumentMultipleMethod() {
        boolean wasException = false;
        try {
            calc.multiply("asd", "g5");
        } catch (Exception e) {
            wasException = true;
        } finally {
            assertTrue(wasException);
        }
    }

    @Test
    public void divide() {
        double expected = 1.5;
        double actual = calc.divide(3, 2);
        assertEquals(expected, actual, 0.000001);

        double expected2 = 3;
        double actual2 = calc.divide(12, 4);
        assertEquals(expected2, actual2, 0.000001);
    }

    @Test
    void square() {
        int expected = 1;
        int actual = calc.square(1);
        assertEquals(expected, actual);

        int expected2 = 81;
        int actual2 = calc.square(9);
        assertEquals(expected2, actual2);
    }

    @AfterAll
    public static void close() {
        calc = null;
    }
}