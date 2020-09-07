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

    public static void ThreeDigitCompare(String input2) {
        int[] parsed = Parse.splitValue(input2);
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

}
