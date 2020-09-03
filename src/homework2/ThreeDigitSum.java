package homework2;

public class ThreeDigitSum extends Main{

    public static void ThreeDigitSum(String input){
        int sum = 0;
            Parse.tryParse(input);
            for (int i = 0; i < 3; i++) {
                int curSymb = Integer.parseInt(input.substring(i, i+1));
                sum = sum + curSymb;
            }

        System.out.println("сумма первых 3х цифр введенного числа: " + sum);
    }

}
