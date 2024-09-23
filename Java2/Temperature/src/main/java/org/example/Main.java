package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите градусы Цельсия:");
        int C = sc.nextInt();


        double Fr =(double) C * 9 / 5 + 32;


        System.out.printf("Фаренгейт: %.2f%n", Fr);


    }
}
