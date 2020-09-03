package homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String input = value();
        Parse lastChar = new Parse();
        lastChar.LastChar(input);

        String input2 = value();
        ThreeDigitSum.ThreeDigitSum(input2);

        InkrementPositiveValue.Plus(value());
    }

    public static String value() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите значение и нажмите [Enter]: ");
        String input = console.nextLine();
        return input;
    }

}
