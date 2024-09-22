import java.util.Scanner;

public class Main {

    // Названия цветов
    static String[] colors = {"Зелёный", "Красный", "Жёлтый", "Белый", "Чёрный"};

    // Названия животных
    static String[] animals = {"Крыса", "Корова", "Тигр", "Заяц", "Дракон", "Змея", "Лошадь", "Овца",
            "Обезьяна", "Курица", "Собака", "Свинья"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();


        int baseYear = 1984;


        int diff = year - baseYear;

        int colorIndex = (diff / 2) % 5;
        if (colorIndex < 0) {
            colorIndex += 5;
        }


        int animalIndex = diff % 12;
        if (animalIndex < 0) {
            animalIndex += 12;
        }


        
        System.out.println(year + " год - это год " + colors[colorIndex] + " " + animals[animalIndex]);
    }
}
