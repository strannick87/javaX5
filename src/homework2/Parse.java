package homework2;

import java.util.Arrays;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parse extends Main{

    public void LastChar(String input){
        String lastChar = input.substring(input.length() - 1);
        System.out.println("последний символ введенного значения: " + lastChar);
    }

    public static void tryParse(String input){
        try {
            int curSymb = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Не могу преобразовать '" + input + "' в число");
        }
    }

    //переделать на split)

    public static int parseThree(String input) {
        int parsed = 0;
        int sum = 1;
        int curSymb;
        int i = 0;
        int[] arr = new int[3];
        //for (int i = 0; i < 3; i++) {
            Pattern pattern = Pattern.compile("\\d*");
            Matcher matcher = pattern.matcher(input);

            while (matcher.find() & i!=3) {

                int firstInt = matcher.start();
                int secInt = matcher.end();
                String matched = input.substring(firstInt, secInt);
                //System.out.println(firstInt);
                //System.out.println(secInt);
                System.out.println(matched);
                MatchResult result = matcher.toMatchResult();
                System.out.println("Current Matcher: "+ result);
                System.out.println(i);

                //matched.replaceAll(" ", "");
                if (firstInt == secInt){
                    secInt++;
                }
                else {
                    curSymb = Integer.parseInt(matched);
                    arr[i] = curSymb;
                    System.out.println(arr[i]);
                    parsed = curSymb + sum;
                }
                i++;
            }

        //}
        System.out.println(Arrays.toString(arr));
        return parsed;
    }

}
