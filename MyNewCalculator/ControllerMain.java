package lessons.MyNewCalculator;

import javafx.scene.chart.ScatterChart;
import lessons.MyNewCalculator.ControllerValidOperation;
import lessons.MyNewCalculator.Data;

import java.io.IOException;
import java.util.Scanner;

public class ControllerMain {
    static Scanner scanner = new Scanner(System.in);

    Data digit = new Data();//получаем значение
    ControllerValidOperation validOperation = new ControllerValidOperation();//валидируем на предмет ввода символа
    ControllerValidOperation chooseOperation = new ControllerValidOperation();//выбор символа операции

        public void getFinal() throws Exception {//пробрасываем exception

            int num1 = digit.getInt();//получили первое значение
            int num2 = digit.getInt();//получили второе значение

            char operation = validOperation.getOperation();//получили и валидировали символ операции

            int result = chooseOperation.calc(num1, num2, operation);//провели вычисление

            System.out.println("Result of the operation: " + result);//получили результат
        }
    }

