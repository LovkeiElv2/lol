import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        enum Month {
            JANUARY("Январь  "),
            FEBRUARY("Февраль "),
            MARCH("Март    "),
            APRIL("Апрель  "),
            MAY("Май     "),
            JUNE("Июнь    "),
            JULY("Июль    "),
            AUGUST("Август  "),
            SEPTEMBER("Сентябрь"),
            OCTOBER("Октябрь "),
            NOVEMBER("Ноябрь  "),
            DECEMBER("Декабрь ");

            private final String name;

            Month(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }


        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Зубчатый массив для хранения температуры
        int[][] temperatures = new int[12][];
        for (int i = 0; i < 12; i++) {
            temperatures[i] = new int[daysInMonth[i]];
        }

        // Заполнение массива случайными температурами в зависимости от времени года
        for (int month = 0; month < 12; month++) {
            for (int day = 0; day < daysInMonth[month]; day++) {
                if (month >= 0 && month <= 1 || month == 11) { // Зима
                    temperatures[month][day] = random.nextInt(21) - 30; // Температура от -30 до -10
                } else if (month >= 2 && month <= 4) { // Весна
                    temperatures[month][day] = random.nextInt(26) - 5; // Температура от -5 до +20
                } else if (month >= 5 && month <= 7) { // Лето
                    temperatures[month][day] = random.nextInt(16) + 15; // Температура от +15 до +30
                } else { // Осень
                    temperatures[month][day] = random.nextInt(26) - 10; // Температура от -10 до +15
                }
            }
        }

        while (true) {
            // Меню для выбора действий
            System.out.println("\nМеню:");
            System.out.println("1. Показать температуру на указанную дату");
            System.out.println("2. Показать самую теплую и самую холодную погоду");
            System.out.println("3. Показать среднюю температуру по каждому месяцу");
            System.out.println("4. Показать температуры по всем месяцам");
            System.out.println("5. Выйти из программы");
            System.out.print("Выберите опцию (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {

                    case 1:
                        // Показать температуру на указанную дату
                        System.out.print("Введите номер месяца (1-12): ");
                        int userMonth = scanner.nextInt() - 1;
                        if (userMonth < 0 || userMonth > 11) {
                            System.out.println("Неверный номер месяца.");
                            break;
                        }
                        System.out.print("Введите номер дня (1-" + daysInMonth[userMonth] + "): ");
                        int userDay = scanner.nextInt() - 1;
                        if (userDay < 0 || userDay >= daysInMonth[userMonth]) {
                            System.out.println("Неверный номер дня.");
                            break;
                        }
                        System.out.println("Температура на указанную дату: " + temperatures[userMonth][userDay] + "°C");
                        break;

                case 2:
                    // Показать самую теплую и самую холодную погоду
                    int minTemp = Integer.MAX_VALUE;
                    int maxTemp = Integer.MIN_VALUE;
                    String coldestDay = "";
                    String hottestDay = "";

                    for (int month = 0; month < 12; month++) {
                        for (int day = 0; day < daysInMonth[month]; day++) {
                            if (temperatures[month][day] < minTemp) {
                                minTemp = temperatures[month][day];
                                coldestDay = "Месяц: " + (month + 1) + ", День: " + (day + 1);
                            }
                            if (temperatures[month][day] > maxTemp) {
                                maxTemp = temperatures[month][day];
                                hottestDay = "Месяц: " + (month + 1) + ", День: " + (day + 1);
                            }
                        }
                    }

                    System.out.println("Самая холодная температура: " + minTemp + "°C, Дата: " + coldestDay);
                    System.out.println("Самая тёплая температура: " + maxTemp + "°C, Дата: " + hottestDay);
                    break;

                case 3:
                    // Показать среднюю температуру по каждому месяцу
                    for (int month = 0; month < 12; month++) {
                        int sum = 0;
                        for (int day = 0; day < daysInMonth[month]; day++) {
                            sum += temperatures[month][day];
                        }
                        double averageTemp = (double) sum / daysInMonth[month];
                        System.out.printf("Средняя температура в месяце %d: %.2f°C%n", (month + 1), averageTemp);
                    }
                    break;

                case 4:
                    // Показать температуры по всем месяцам
                    System.out.println("\nТемпературы по всем месяцам:");
                    for (int month = 0; month < 12; month++) {
                        System.out.print(Month.values()[month].getName() + ": ");
                        for (int day = 0; day < daysInMonth[month]; day++) {
                            System.out.printf("%4d", temperatures[month][day]);
                        }
                        System.out.println();
                    }
                    break;


                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите вариант от 1 до 5.");
                    break;
            }
        }
    }
}
