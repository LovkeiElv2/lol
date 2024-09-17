package org.example;

public class App {
    public void run() {
        System.out.println("Демо Программа хранения данных работников");

        // Creating an address for the person
        Address address = new Address("Pushki", "Johvi", "10", "11");

        // Creating a person with a name, birthdate, phone, and address
        Person person = new Person("Ivan", "Ivanov", 2000, 10, 11, "56565656", address);

        // Creating an employee and setting position and salary
        Employee employee = new Employee(person, "Director", "3000");

        // Printing employee details
        System.out.printf("Работник:%n %s %s%n %d лет%n Должность: %s%n Зарплата: %s%n Адрес: %s, %s, %s, %s%n",
                employee.getPerson().getFirstName(),
                employee.getPerson().getLastName(),
                employee.getPerson().getAge(),
                employee.getPosition(),
                employee.getSalary(),
                employee.getPerson().getAddress().getCity(),
                employee.getPerson().getAddress().getStreet(),
                employee.getPerson().getAddress().getHouse(),
                employee.getPerson().getAddress().getRoom()
        );
    }
}
