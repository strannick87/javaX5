package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Parse.PrintLastChar(value());

        String input2 = value();
        CompareValue.ThreeDigitSum(input2);

        MathValue.Plus(value());
        MathValue.PlusOrMinus(value());
        CompareValue.ThreeDigitCompare(threeValue());
        MathValue.PrintType(value());

        CompareValue.CallPrice(value());
        MathValue.ArrayParse();
        int[] arrForSort = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        System.out.println("Массив до сортировки"+ Arrays.toString(arrForSort));
        CompareValue.BubbleGum(arrForSort);
        int[] lastArr = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        CompareValue.SubZeroWins(lastArr);
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
