package homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        String input = value();
//        Parse lastChar = new Parse();
//        lastChar.LastChar(input);
//
//        String input2 = value();
//        CompareValue.ThreeDigitSum(input2);
//
//        MathValue.Plus(value());
//        MathValue.PlusOrMinus(value());
        CompareValue.ThreeDigitCompare(threeValue());
    }

    public static String value() {
        Scanner console = new Scanner(System.in);
        System.out.println("-- Введите значение и нажмите [Enter]: ");
        String input = console.nextLine();
        return input;
    }

    public static String threeValue() {
        Scanner console = new Scanner(System.in);
        System.out.println("-- Введите пожалуйста 3 числа через пробел и нажмите [Enter]: ");
        String input = console.nextLine();
        return input;
    }

}
