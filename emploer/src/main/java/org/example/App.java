package org.example;

import java.util.Scanner;

public class App {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("Демо Программа \"Отдел Кадров\"");
        boolean repeat = true;
        do {
            System.out.println("Список задач:");
            System.out.println("0. Выйти из программы");
            System.out.println("1. Добавить работника");
            System.out.println("2. Список работников");
            System.out.println("3. Работники по имени и фамилии");
            System.out.print("Выберите задачу: ");
            int task = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left-over
            switch (task) {
                case 0:
                    System.out.println("Выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Выбрана задача 1");
                    createEmployee();
                    break;
                case 2:
                    System.out.println("Выбрана задача 2");
                    break;
                case 3:
                    System.out.println("Выбрана задача 3");
                    break;
                default:
                    System.out.println("Некорректный выбор");
            }
        } while (repeat);
        System.out.println("bye bye");
    }
//        Address address = new Address("Pushkin", "Johvi", "10", "11");
//        Person person = new Person("Ivan", "Ivanov", 2000, 10, 11, "56565656", address);
//        Employee employee = new Employee();
//        employee.setPosition("Director");
//        employee.setSalary("3000");
//        employee.setPerson(person);
//
//        System.out.printf("Работник:%n %s %s%n %d лет%n Телефон: %s%n Город: %s%n Должность: %s%n",
//                employee.getPerson().getFirstName(),
//                employee.getPerson().getLastName(),
//                employee.getPerson().Age(),
//                employee.getPerson().getPhone(),
//                employee.getPerson().getAddress().getCity(),
//                employee.getPosition()
//        );
//        address = new Address("Karu", "Tallinn", "4", "2");
//        person = new Person("Ilja", "Drevolub", 1997, 4, 27, "52469312", address);
//        employee = new Employee();
//        employee.setPosition("Lumberjack");
//        employee.setSalary("4500");
//        employee.setPerson(person);
//
//        System.out.printf("Работник:%n %s %s%n %d лет%n Телефон: %s%n Город: %s%n Должность: %s%n",
//                employee.getPerson().getFirstName(),
//                employee.getPerson().getLastName(),
//                employee.getPerson().Age(),
//                employee.getPerson().getPhone(),
//                employee.getPerson().getAddress().getCity(),
//                employee.getPosition()
//        );
//}





    private void createEmployee() {
        System.out.print("Имя: ");
        String firstname = scanner.nextLine();
        System.out.print("Фамилия: ");
        String lastname = scanner.nextLine();
        System.out.print("Должность: ");
        String position = scanner.nextLine();
        System.out.print("Зарплата: ");
        String salary = scanner.nextLine();
        System.out.print("День рождения (число): ");
        int birthDay = Integer.parseInt(scanner.nextLine());
        System.out.print("Месяц рождения: ");
        int birthMonth = Integer.parseInt(scanner.nextLine());
        System.out.print("Год рождения: ");
        int birthYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Номер телефона: ");
        String number = scanner.nextLine();
        System.out.print("Адрес: ");
        String address = scanner.nextLine();
        System.out.print("Город: ");
        String city = scanner.nextLine();
        System.out.print("Улица: ");
        String street = scanner.nextLine();
        System.out.print("Дом: ");
        String house = scanner.nextLine();
        System.out.print("Квартира: ");
        String room = scanner.nextLine();

        Address addr = new Address(street, city, house, room);
        Person person = new Person(firstname, lastname, birthYear, birthMonth, birthDay, number, addr);

        Employee employee = new Employee();
        employee.setPosition(position);
        employee.setSalary(salary);
        employee.setPerson(person);

        System.out.printf("Работник:%n %s %s%n %d лет%n Телефон: %s%n Город: %s%n Должность: %s%n",
                employee.getPerson().getFirstName(),
                employee.getPerson().getLastName(),
                employee.getPerson().Age(),
                employee.getPerson().getPhone(),
                employee.getPerson().getAddress().getCity(),
                employee.getPosition()
        );
        saveEmployee(employee);

    }
    private void saveEmployee(Employee employee) {

    }
}