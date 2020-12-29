package company.v1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> numbers = Files.readAllLines(Paths.get("C://Users/HunterAlex/Documents/numbers.txt"));
        int num1 = Integer.parseInt(numbers.get(0));
        int num2 = Integer.parseInt(numbers.get(1));

        switch (args[0]) {
            case "add":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case "mul":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case "sub":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case "div":
                System.out.println(num1 + " / " + num2 + " = " + ((float) num1 / num2));
                break;
            default:
                System.out.println("Operation Invalid");
        }
    }
}
