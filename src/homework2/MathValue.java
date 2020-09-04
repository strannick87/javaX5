package homework2;

public class MathValue {
    public static void Plus(String input){
        Parse.tryParse(input);
        int value = Integer.parseInt(input);
        if (value>0){
            value = value + 1;
        }
        System.out.println("инкремент положительного числа или само отрицательное: " + value);
    }

    public static void PlusOrMinus(String input){

        //Parse.tryParse(input);
        int value = Integer.parseInt(input);
        if (input == null){
            value = 10;
        }
        else if (value>0){
            value = value + 1;
        }
        else{
            value = value -2;
        }
        System.out.println("инкремент положительного числа или декремент отрицательного: " + value);
    }
}
