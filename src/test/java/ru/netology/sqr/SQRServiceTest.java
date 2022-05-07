package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void testRanges(int begin, int end, int expected) {
        SQRService service = new SQRService();
        int result = service.sqrFrom10To99InRangeCount(begin, end);
        assertEquals(expected, result);
    }
}
