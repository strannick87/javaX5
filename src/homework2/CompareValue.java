package homework2;

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
        int parsed = Parse.parseThree(input);
        //Parse parsed = new Parse();
        System.out.println("первое число + 1: " + parsed);

    }

}