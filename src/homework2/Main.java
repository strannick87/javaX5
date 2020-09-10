package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("-- Введите значение для отображения последнего символа и нажмите [Enter]: ");
        Parse.printLastChar(value());

        System.out.println("-- Введите число для расчета суммы первых 3х символов и нажмите [Enter]: ");
        CompareValue.threeDigitSum();
        System.out.println("-- Введите положительное или отрицательное значение и нажмите [Enter]: ");
        MathValue.inkrementValue(value());
        System.out.println("-- Введите положительное или отрицательное значение и нажмите [Enter]: ");
        MathValue.plusOrMinusValue(value());
        System.out.println("-- Введите 3 значения через пробел и нажмите [Enter]: ");
        CompareValue.threeDigitCompare(threeValue());
        System.out.println("-- Введите положительное или отрицательное значение и нажмите [Enter]: ");
        MathValue.printType(inputNumber());
        System.out.println("-- Введите код города для расчета стоимости тарифа (Москва=905,Ростов=194,Краснодар=491,Киров=800) и нажмите [Enter]: ");
        CompareValue.callPrice(value());
        //Thread.sleep(2000);
        MathValue.goArrayParse();
        int[] arrForSort = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        System.out.println("Исходный массив"+ Arrays.toString(arrForSort));
        CompareValue.turnArroundArray(arrForSort);
        int[] lastArr = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        System.out.println("Массив до сортировки"+ Arrays.toString(lastArr));
        CompareValue.goZeroDawn(lastArr);
    }

    public static String value() {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        return input;
    }

    public static int inputNumber() {
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        return input;
    }

    public static String threeValue() {
        Scanner console = new Scanner(System.in);
        System.out.println("-- Введите пожалуйста 3 числа через пробел и нажмите [Enter]: ");
        String input = console.nextLine();
        return input;
    }

}
