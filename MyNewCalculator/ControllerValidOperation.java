package lessons.MyNewCalculator;

import lessons.MyNewCalculator.WrongStatementException;

import java.util.Scanner;

public class ControllerValidOperation {
    static Scanner scanner = new Scanner(System.in);

    public static char getOperation() throws WrongStatementException {
        System.out.println("Enter the operation:");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            throw new WrongStatementException("Hello, Dear friend!" +
                    "You see that message, because your hands are growning from another place!" +
                    "You have entered the wrong statement!" +
                    "Please, try again!");

        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation) throws WrongStatementException {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case ')':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            case '(':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            case '!':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            case '@':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            case '#':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            case '$':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            case '%':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            case '^':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            case '&':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            case '_':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            case '=':
                throw new WrongStatementException("Hello, Dear friend!" +
                        "You see that message, because your hands are growning from another place!" +
                        "You have entered the wrong statement!" +
                        "Please, try again!");
            default:
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
