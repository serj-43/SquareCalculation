package ru.netology.sqr;

public class SQRService {
    public int sqrFrom10To99InRangeCount(int beginRange, int endRange) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (Math.pow(i, 2) >= beginRange && Math.pow(i, 2) <= endRange) {
                counter++;
            }
        }
        return counter;
    }
}
