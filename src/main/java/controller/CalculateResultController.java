package controller;

import model.Parameters;
import service.CalculateResultServiceImpl;
import service.impl.CalculateResultService;
import view.View;

import java.util.Scanner;

public class CalculateResultController {

    View view = View.getInstance();
    Parameters parameters = Parameters.getInstance();

    public void showResult() {
        view.printMessage("Square of triangle equals = " + getResult());
    }

    private double getResult() {
        try {
            getParams();
        } catch (Exception e) {
            System.err.append("Invalid parameter: empty or not a numeral");
            System.exit(1);
        }

        CalculateResultService calculateResultService = new CalculateResultServiceImpl();
        return calculateResultService.getSquare(parameters.getFirstSideLength(), parameters.getSecondSideLength(),
                parameters.getAngle());
    }

    private void getParams() throws Exception {
        view.printMessage("Input first side Length");
        Scanner sc = new Scanner(System.in);
        Integer firstSideLength = Integer.valueOf(sc.nextLine());
        view.printMessage("Input second side Length");
        Integer secondSideLength = Integer.valueOf(sc.nextLine());
        view.printMessage("Input angle");
        Integer angle = Integer.valueOf(sc.nextLine());
        parameters.setFirstSideLength(firstSideLength);
        parameters.setSecondSideLength(secondSideLength);
        parameters.setAngle(angle);
    }


}
