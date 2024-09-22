import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Русский алфавит
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

        // Множество для хранения уникальных букв из текста
        HashSet<Character> lettersInText = new HashSet<>();

        // Ввод текста пользователем
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine().toLowerCase(); // Приводим к нижнему регистру

        // Проход по тексту и добавление всех букв в множество
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (alphabet.indexOf(currentChar) != -1) { // Если символ — это буква русского алфавита
                lettersInText.add(currentChar);
            }
        }

        // Проверка: если количество уникальных букв равно количеству букв в алфавите, текст содержит все буквы
        if (lettersInText.size() == alphabet.length()) {
            System.out.println("Текст содержит все буквы русского алфавита.");
        } else {
            System.out.println("Текст НЕ содержит все буквы русского алфавита.");
        }

        scanner.close();
    }
}
