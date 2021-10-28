public class SQRService {
    public int countSquareValue(int lowLim, int uplim) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            if (i * i >= lowLim && i * i <= uplim) {
                count++;
            }
        }
        return count;
    }
}
