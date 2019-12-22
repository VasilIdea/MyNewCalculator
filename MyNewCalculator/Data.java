package lessons.MyNewCalculator;

import lessons.MyNewCalculator.WrongStatementException;

import java.util.Scanner;

public class Data {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt() throws WrongStatementException {//кидаем эксепшен
        System.out.println("Enter a number:");
        int num = 0;
        String check = null;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            throw new WrongStatementException("Hello, Dear friend!" +
                    "You see that message, because your hands are growning from another place!" +
                    "You have entered the wrong statement!" +
                    "Please, try again!");
        }
        return num;
    }
}
