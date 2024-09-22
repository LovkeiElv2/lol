package org.example;
import java.util.Scanner;
public class Main  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите градусы цельсия");
        int Fr = sc.nextInt();
        short num1 = 32, num2 = 9, num3 = 5;
        double res = Fr*num2/num3+32;
        System.out.println("Фарингейт " + res);
    }
}