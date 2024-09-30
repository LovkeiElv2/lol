package ee.ivkhkdev;

import ee.ivkhkdev.interfaces.Input;
import ee.ivkhkdev.model.Customer;

public class App {
    private Input input;
    public static Customer[] customers = new Customer[100];

    public App(Input input) {
        this.input = input;
    }

    public void run() {
        boolean repeat = true;
        do {
            System.out.println("Список задач:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить пользователя");
            System.out.println("Введите номер задачи");

            int task = input.nextInt();
            input.nextLine(); // Ensure to consume the newline

            switch (task) {
                case 0:
                    System.out.println("Выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("1. Добавить пользователя");
                    // Logic for adding a user can be implemented here
                    break;
                default:
                    System.out.println("Выберите номер из списка задач!");
            }
        } while (repeat);
        System.out.println("bai");
    }
}
