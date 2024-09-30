package ee.ivkhkdev;
import ee.ivkhkdev.tools.ConsoleInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("JPTV23liberary");
        App app = new App(new ConsoleInput(new Scanner(System.in)));
        app.run();
    }
}
