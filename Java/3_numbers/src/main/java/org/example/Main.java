package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трёхзначное число: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int units = number % 10;
            int tens = (number / 10) % 10;
            int hundreds = number / 100;
            int sum = units + tens + hundreds;

            System.out.println("Число единиц: " + units);
            System.out.println("Число десятков: " + tens);
            System.out.println("Число сотен: " + hundreds);
            System.out.println("Сумма цифр: " + sum);
        } else {
            System.out.println("Пожалуйста, введите трёхзначное число.");
        }

        scanner.close();
    }
}