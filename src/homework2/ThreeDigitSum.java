package homework2;

public class ThreeDigitSum extends Main{

    public void ThreeDigitSum(String input){
        int firstChar = Integer.parseInt(input.substring(0, 1));
        int secChar = Integer.parseInt(input.substring(1, 2));
        int thrdChar = Integer.parseInt(input.substring(2, 3));
        int sum = firstChar + secChar + thrdChar;
        System.out.println("сумма цифр введенного числа: " + sum);
    }

}
