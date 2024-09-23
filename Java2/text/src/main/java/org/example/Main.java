import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";


        HashSet<Character> lettersInText = new HashSet<>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine().toLowerCase();


        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (alphabet.indexOf(currentChar) != -1) { // Если символ это буква русскго алфавита
                lettersInText.add(currentChar);
            }
        }


        if (lettersInText.size() == alphabet.length()) {
            System.out.println("Текст содержит все буквы русского алфавита.");
        } else {
            System.out.println("Текст НЕ содержит все буквы русского алфавита.");
        }

        scanner.close();
    }
}
