package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import service.impl.CalculateResultService;

import static java.lang.Math.*;

public class CalculateResultServiceImpl implements CalculateResultService {

    private static final Logger log = LoggerFactory.getLogger(CalculateResultServiceImpl.class);

    private double cosineTheorem(int firstLength, int secondLength, int angle) {
        log.debug("service.CalculateResultServiceImpl cosineTheorem: start");
        double c = sqrt(pow(firstLength, 2) + pow(secondLength, 2) - 2 * firstLength * secondLength * cos(angle));
        log.debug("service.CalculateResultServiceImpl cosineTheorem: c ", c);
        log.debug("service.CalculateResultServiceImpl cosineTheorem: end");
        return c;
    }

    public double getSquare(int firstLength, int secondLength, int angle) {
        log.debug("service.CalculateResultServiceImpl getSquare: start");
        double thirdSide = cosineTheorem(firstLength, secondLength, angle);
        log.debug("service.CalculateResultServiceImpl getSquare: end");
        return thirdSide * secondLength * firstLength;
    }

}
