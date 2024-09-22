package org.example;


import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Инициализация сканера для ввода с клавиатуры
        Random random = new Random();  // Инициализация объекта Random для генерации случайных чисел






        System.out.println("Тест по матемаике.");
        int Answers = 0;


        for (int i = 0; i < 5; i++) {

            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;

            System.out.println(num1 + " " + "*" + " " + num2 + "= ");
            int Answer;
            Answer = num1 * num2;

            int UserAnswer = scanner.nextInt();
            if (Answer == UserAnswer) {
                System.out.println("Правильно " + Answer);
            Answers++;}
            else  {
                System.out.println("Неправильно, ответ - " + Answer);
        }


    }
        System.out.println("\nВаш результат: " + Answers + " правильных ответов из 5.");
        if (Answers == 5) {
            System.out.println("Молодец!");
        } else if (Answers >= 3) {
            System.out.println("Надо бы еще поучить.");
        } else {
            System.out.println("Срочно нужно учить таблицу умножения!");
        }
        scanner.close();
    }
}
