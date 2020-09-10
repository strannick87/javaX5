package homework2;

import java.util.ArrayList;

public class MathValue {
    public static void inkrementValue(String input) {

        int value = Parse.tryParse(input);
        if (value > 0) {
            value = value + 1;
        }
        System.out.println("инкремент положительного числа или само отрицательное: " + value);
    }

    public static void plusOrMinusValue(String input) {


        int value = Integer.parseInt(input);
        if (input == null) {
            value = 10;
        } else if (value > 0) {
            value = value + 1;
        } else {
            value = value - 2;
        }
        System.out.println("инкремент положительного числа или декремент отрицательного: " + value);
    }

    public static int findTypeValue(int input) {
        //int parsed = Parse.tryParse(input);
        int type = 0;
        int lastChar = input % 10;
        if ((lastChar % 2) == 0) {
            if (input > 0) {
                type = 2;
            } else if (0 == input) {
                type = 0;
            } else {
                type = -2;
            }
        } else if ((lastChar % 1) == 0) {
            if (input > 0) {
                type = 1;
            } else {
                type = -1;
            }
        }
        return type;
    }

    public static void printType(int input) {

        int type = findTypeValue(input);
        switch (type) {
            case 2:
                System.out.println("Число " + input + " четное положительное");
                break;
            case -2:
                System.out.println("Число " + input + " четное отрицательное");
                break;
            case 1:
                System.out.println("Число " + input + " нечетное положительное");
                break;
            case -1:
                System.out.println("Число " + input + " нечетное отрицательное");
                break;
            case 0:
                System.out.println("нулевое число");
                break;
        }
    }

    public static void goArrayParse() {
        int[] arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        int max = arr[0];
        for (int num : arr) {
            if (num > 0) {
                if (num > max) {
                    max = num;
                }
            }
        }
        int posArr = 0;
        int evenMinArr = 0;
        int countPos = 0;
        double averageMin = 0;
        int k = 0;
        ArrayList<Integer> arrMin = new ArrayList<>();
        double sumMin = 0;

        for (int i = 0; i < arr.length; i++) {
            int curVal = arr[i];

            //String valStr = curVal + "";
            if (curVal > 0) {
                countPos = countPos +1;
                if (curVal == 1 || curVal == 2) {
                    posArr = posArr + curVal;
                }
            }else if(curVal < 0){
                if (curVal == -2) {
                    evenMinArr = evenMinArr + curVal;
                }

                arrMin.add(curVal);
                k = k +1;
            }
        }

        for (int j = 0; j < arrMin.size(); j++) {
            sumMin = sumMin + arrMin.get(j);
        }
        averageMin = sumMin / arrMin.size();

        System.out.println("Дан массив целых чисел: [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]");
        System.out.println("Максимальным в массиве является = " + max);
        System.out.println("Сумма положительных элементов = " + posArr);
        System.out.println("Сумма четных отрицательных элементов = " + evenMinArr);
        System.out.println("количество положительных элементов = " + countPos);
        System.out.println("среднее арифметическое отрицательных элементов = " + averageMin);
    }
}
