import java.util.Scanner;

public class Main {


    static String[] colors = {"Зелёный", "Красный", "Жёлтый", "Белый", "Чёрный"};


    static String[] animals = {"Крыса", "Корова", "Тигр", "Заяц", "Дракон", "Змея", "Лошадь", "Овца",
            "Обезьяна", "Курица", "Собака", "Свинья"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();


        int baseYear = 1984;


        int diff = year - baseYear;

        int color = (diff / 2) % 5;
        if (color < 0) {
            color += 5;
        }


        int animal = diff % 12;
        if (animal < 0) {
            animal += 12;
        }


        
        System.out.println(year + " год - это год " + colors[color] + " " + animals[animal]);
    }
}
