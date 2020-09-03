package homework2;

public class Parse extends Main{

    public void LastChar(String input){
        String lastChar = input.substring(input.length() - 1);
        System.out.println("последний символ введенного значения: " + lastChar);
    }

}
