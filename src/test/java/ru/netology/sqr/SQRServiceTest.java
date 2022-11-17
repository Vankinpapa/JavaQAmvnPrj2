package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    void sqtrtestOne() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(10, 99);
        int expect = 6;

        Assertions.assertEquals(expect, actual);

    }

    @Test
    void sqtrtestTwo() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(10, 300);
        int expect = 14;

        Assertions.assertEquals(expect, actual);

    }

    @Test
    void sqtrtestThree() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(1, 1);
        int expect = 1;

        Assertions.assertEquals(expect, actual);

    }

    @Test
    void sqtrtestFour() {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(299, 301);
        int expect = 0;

        Assertions.assertEquals(expect, actual);

    }
}