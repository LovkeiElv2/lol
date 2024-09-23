package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("20 случайных четных целых чисел. ");
        int[] numbers = new int[20];
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            int num = (random.nextInt(10) + 1) * 2;
            numbers[i] = num;
            sum += num;
            System.out.println(num);
        }


        double average = (double) sum / numbers.length;


        System.out.println("Среднее арифметическое = " + average);
    }
}
