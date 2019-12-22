package lessons.MyNewCalculator;

import lessons.MyNewCalculator.ControllerMain;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MainView {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        ControllerMain conclusion = new ControllerMain();

        conclusion.getFinal();

    }
}

