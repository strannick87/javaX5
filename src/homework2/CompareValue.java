package homework2;

import java.util.Arrays;

public class CompareValue extends Main{

    public static void ThreeDigitSum(String input){
        int sum = 0;

            Parse.tryParse(input);
            for (int i = 0; i < 3; i++) {
                int curSymb = Integer.parseInt(input.substring(i, i+1));
                sum = sum + curSymb;
            }

        System.out.println("сумма первых 3х цифр введенного числа: " + sum);
    }

    public static void ThreeDigitCompare(String input) {

        int[] parsed = Parse.splitValue(input);
        int min = parsed[0];
        for (int num : parsed) {
            if (num < min) {
                min = num;
            }
        }
            System.out.println("наименьшее число из введенных: " + min);
    }

    public static void CallPrice(String input) {
        switch (input) {
            case "905":
                System.out.println("Москва. Стоимость разговора: 41.5 руб");
                break;
            case "194":
                System.out.println("Ростов. Стоимость разговора: 1.98 руб");
                break;
            case "491":
                System.out.println("Краснодар. Стоимость разговора: 2.69 руб");
                break;
            case "800":
                System.out.println("Киров. Стоимость разговора: 5.00 руб");
                break;
        }

    }

    public static void BubbleGum(int[] inputArray) {

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

    public static void SubZeroWins(int[] inputArray) {
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
