package lesson9.exercise1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    NextDayCalculator nextDayCalculator = new NextDayCalculator();

    @Test
    @DisplayName("1/1/2018")
    void case1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "02/01/2018";
        String actual = nextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("31/1/2018")
    void case2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "01/02/2018";
        String actual = nextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("30/4/2018")
    void case3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "01/05/2018";
        String actual = nextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("28/2/2018")
    void case4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "01/03/2018";
        String actual = nextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("29/2/2020")
    void case6() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "01/03/2020";
        String actual = nextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("31/12/2018")
    void case7() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "01/01/2019";
        String actual = nextDayCalculator.getNextDay(day, month, year);
        assertEquals(expected, actual);
    }

}