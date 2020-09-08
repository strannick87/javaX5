package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("-- Введите значение для отображения последнего символа и нажмите [Enter]: ");
        Parse.PrintLastChar(value());
        System.out.println("-- Введите число для расчета суммы первых 3х символов и нажмите [Enter]: ");
        CompareValue.ThreeDigitSum(value());
        System.out.println("-- Введите положительное или отрицательное значение и нажмите [Enter]: ");
        MathValue.Plus(value());
        System.out.println("-- Введите положительное или отрицательное значение и нажмите [Enter]: ");
        MathValue.PlusOrMinus(value());
        //System.out.println("-- Введите 3 значения через пробел и нажмите [Enter]: ");
        CompareValue.ThreeDigitCompare(threeValue());
        System.out.println("-- Введите положительное или отрицательное значение и нажмите [Enter]: ");
        MathValue.PrintType(value());
        System.out.println("-- Введите код города для расчета стоимости тарифа (Москва=905,Ростов=194,Краснодар=491,Киров=800) и нажмите [Enter]: ");
        CompareValue.CallPrice(value());
        Thread.sleep(500);
        MathValue.ArrayParse();
        int[] arrForSort = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        System.out.println("Массив до сортировки"+ Arrays.toString(arrForSort));
        CompareValue.BubbleGum(arrForSort);
        int[] lastArr = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        System.out.println("Массив до сортировки"+ Arrays.toString(lastArr));
        CompareValue.SubZeroWins(lastArr);
    }

    public static String value() {
        Scanner console = new Scanner(System.in);
        //System.out.println("-- Введите значение и нажмите [Enter]: ");
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
