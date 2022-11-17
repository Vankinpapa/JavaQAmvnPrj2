package ru.netology.sqr;

public class SQRService {
    public int calcSqrt(int a, int b) {
        int sqr = 0;

        for (int i = 0; i <= b; i++) {
            if (i * i >= a) {
                if (i * i <= b) {
                    sqr++;
                }
            }

        }
        return sqr;
    }
}
