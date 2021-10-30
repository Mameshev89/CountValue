package ru.netology.sqr;

public class SQRService {
    public int countSquareValue(int lowLim, int uplim) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            int sqr = i * i;
            if (sqr >= lowLim && sqr <= uplim) {
                count++;
            }
        }
        return count;
    }
}
