package homework2;

public class InkrementPositiveValue {
    public static void Plus(String input){
        Parse.tryParse(input);
        int value = Integer.parseInt(input);
        if (value>0){
            value = value + 1;
        }
        System.out.println("инкремент положительного числа или само отрицательное: " + value);
    }
}
