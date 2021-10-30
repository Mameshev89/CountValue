package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'Check with range 200 and 300',200,300,3",
            "'Check with range 201 and 300',201,300,3",
            "'Check with range 202 and 300',200,299,3",
            "'Check with range 250 and 300',250,300,2",
            "'Check with range 100 and 1000',100,1000,22",
            "'Check with range 101 and 1000',101,1000,21",
            "'Check with range 102 and 1000',102,1000,21",
            "'Check with range 103 and 1000',103,1000,21",
            "'Check with range 100 and 999',100,999,22",
            "'Check with range 100 and 1001',100,1001,22",
            "'Check with range 1000 and 1000_000',100,1000_000,89"})
    void countSquareValue(String testName, int lowLim, int uplim, int expected) {
        SQRService run = new SQRService();

        int actual = run.countSquareValue(lowLim, uplim);
        assertEquals(expected, actual);
    }
}