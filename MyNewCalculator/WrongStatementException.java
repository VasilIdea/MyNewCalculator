package lessons.MyNewCalculator;

public class WrongStatementException extends Exception {//создаём наш эксепшен

    WrongStatementException(String msg) {
        super(msg);
    }
}