package homework1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
  public static void main(String[] args) {
    String intro = "Калькулятор.\nПрограмма выполняет арифметические выражения над действительными\nчислами и поддерживает следующие операции: +, -, *, /.\nДля завершения работы программы введите \"exit\" и нажмите [Enter].\n";
    System.out.println(intro);

    Scanner console = new Scanner(System.in);
    String input = "";

    do {
      System.out.println("Введите выражение и нажмите [Enter]: ");
      input = console.nextLine();
      String replaced = input.replaceAll(" ", "");
      System.out.println(replaced);

      try {
        //Integer.parseInt(replaced);
        parser(replaced);
      } catch (NumberFormatException e) {
        System.out.println("Ошибка: Не могу преобразовать '" + replaced + "' в число");
      }

    }
      while (!input.contains("exit"));
    System.out.println("До свидания!");

  }
  public static String parser(String input) {

    for (int i = 0; i < input.length(); i++) {

      Pattern pattern = Pattern.compile("\\d*");
      Matcher matcher = pattern.matcher(input);

      System.out.println(input);
      while (matcher.find()) {
          int sum = 0;
          input.substring(matcher.start(), matcher.end());
          System.out.println(input.substring(matcher.start(), matcher.end()));
          int firstInt = Integer.parseInt(input);
          int parsed = firstInt + sum;
          System.out.println(parsed);

        }
      }

    return input;
  }
}
