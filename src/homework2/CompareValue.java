package homework2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CompareValue extends Main{

    public static void threeDigitSum(){
        int sum = 0;
        Scanner console = new Scanner(System.in);
        int inputInt = console.nextInt();

        Integer i = new Integer(inputInt);
        char[] chars = i.toString().toCharArray();
        for(int j = 1; j < 3 && j < chars.length; j++){
            sum = sum + Integer.parseInt(String.valueOf(chars[j]));
        }

        System.out.println("сумма первых 3х цифр введенного числа: " + sum);
    }

    public static void threeDigitCompare(String input) {

        int[] parsed = Parse.splitValue(input);
        int min = parsed[0];
        for (int num : parsed) {
            if (num < min) {
                min = num;
            }
        }
            System.out.println("наименьшее число из введенных: " + min);
    }

    public static void callPrice(String input) {
        System.out.println("-- Введите количество минут(секунды через запятую) разговора и нажмите [Enter]: ");
        Scanner console = new Scanner(System.in);
        String time = console.nextLine();
        double timeDouble = Double.parseDouble( time.replace(",",".") );
        switch (input) {
            case "905":
                System.out.println("Москва. Стоимость разговора: " +(timeDouble/10)*41.5+" руб");
                break;
            case "194":
                System.out.println("Ростов. Стоимость разговора: " +(timeDouble/10)*1.98+" руб");
                break;
            case "491":
                System.out.println("Краснодар. Стоимость разговора: " +(timeDouble/10)*2.69+" руб");
                break;
            case "800":
                System.out.println("Киров. Стоимость разговора: " +(timeDouble/10)*5.00+" руб");
                break;
        }

    }

    public static void sortBubbleGum(int[] inputArray) {

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < inputArray.length-1; i++) {
                if(inputArray[i] > inputArray[i+1]){
                    isSorted = false;

                    buf = inputArray[i];
                    inputArray[i] = inputArray[i+1];
                    inputArray[i+1] = buf;
                }
            }
        }
        System.out.println("Массив после сортировки"+Arrays.toString(inputArray));
    }

    public static void turnArroundArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length / 2; i++) {
            int tmp = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - i - 1];
            inputArray[inputArray.length - i - 1] = tmp;
        }
        System.out.println("Перевернутый массив"+Arrays.toString(inputArray));
    }

    public static void goZeroDawn(int[] inputArray) {
        int[] zeroDawn = new int[inputArray.length];
        int z=0;
        System.out.println("Массив с нулями в конце:");
        for (int i = 0; i < inputArray.length-1; i++) {
            if (inputArray[i] != 0) {
                zeroDawn[z] = inputArray[i];
                z++;
            }
        }
        for (int i = 0; i < zeroDawn.length; i++) {
            System.out.print(zeroDawn[i]+" ");
        }
    }

}
