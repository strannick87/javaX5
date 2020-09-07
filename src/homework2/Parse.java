package homework2;

import java.util.Arrays;

public class Parse extends Main{

    public static int LastChar(String input){
        String lastChar = input.substring(input.length() - 1);
        //System.out.println("последний символ введенного значения: " + lastChar);
        int lastInt = tryParse(lastChar);
        return lastInt;
    }

    public static void PrintLastChar(String input) {
        int lastInt = LastChar(input);
        System.out.println("последний символ введенного значения: " + lastInt);
    }

    public static int tryParse(String input) {
        int curSymb = 0;
        try {
            curSymb = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Не могу преобразовать '" + input + "' в число");

        }
        return curSymb;
    }


    public static int[] splitValue(String input) {
        String[] parsed = input.split(" ");
        //System.out.println(Arrays.toString(parsed));
        int numArr[] = new int[parsed.length];
        for (int i = 0; i < parsed.length; i++) {
            numArr[i] = Integer.parseInt(parsed[i]);
        }
        return numArr;
    }


}
