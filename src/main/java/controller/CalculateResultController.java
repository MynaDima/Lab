package controller;

import service.CalculateResultServiceImpl;
import service.impl.CalculateResultService;
import view.View;

import java.util.Scanner;

public class CalculateResultController {

    View view = new View();

    public void showResult() {
        view.printMessage("Square of triangle equals = " + getResult());
    }

    private double getResult() {
        getParams();
        CalculateResultService calculateResultService = new CalculateResultServiceImpl();
        return calculateResultService.getSquare(1, 2, 3);
    }

    private void getParams() {
        view.printMessage("Input first side Length");
        Scanner sc = new Scanner(System.in);
        String firstSideLength = sc.nextLine();
        view.printMessage("Input second side Length");
        String secondSideLength = sc.nextLine();
        view.printMessage("Input angle");
        String angle = sc.nextLine();


    }

    private boolean validateParameter(String parameter) {
        Integer parameterValue = Integer.valueOf(parameter);
        return !(parameterValue == null && parameterValue < 0);
    }

}
