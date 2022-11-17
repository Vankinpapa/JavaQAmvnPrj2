package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int y = service.calcSqrt(1, 10);
        System.out.println(y);
    }
}