import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

  @ParameterizedTest
  @CsvSource(value = {"'Check with range 200 and 300',200,300,3",
                    "'Check with range 201 and 300',201,300,3",
                    "'Check with range 202 and 300',200,299,3",
                    "'Check with range 250 and 300',250,300,2"})

    void countSquareValue(String testName,int lowLim, int uplim, int expected) {
        SQRService run = new SQRService();

        int actual = run.countSquareValue(lowLim, uplim);
        assertEquals(expected,actual);
    }
}