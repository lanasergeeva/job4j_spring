package spring.lessons.di;

import java.util.Calendar;
import java.util.Scanner;

public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String askStr() {
        System.out.println("Just write some text and I will return it");
        return scanner.nextLine();
    }
}
