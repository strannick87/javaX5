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

    public static void TypeValue(String input) {
        int parsed = Parse.tryParse(input);
        //int value = Integer.parseInt(input);

        int lastChar = Parse.LastChar(input);
        if((lastChar%2)==0){
            if (parsed>0){
                System.out.println("Число " + input + " четное положительное");
            }
            else if(0 == parsed){
                System.out.println("нулевое число");
            }
            else {
                System.out.println("Число " + input + " четное отрицательное");
            }
        }
        else if((lastChar%1)==0){
                if (parsed>0) {
                    System.out.println("Число " + input + " нечетное положительное");
                }
                else {
                    System.out.println("Число " + input + " нечетное отрицательное");
                }
            }

    }

}
