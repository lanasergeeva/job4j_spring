package spring.lessons.di;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Scope("prototype")
public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String askStr() {
        System.out.println("Just write some text and I will return it");
        return scanner.nextLine();
    }
}
