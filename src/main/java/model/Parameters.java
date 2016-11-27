package model;

public class Parameters {

    private static Parameters instance;

    private int firstSideLength;
    private int secondSideLength;
    private int angle;

    private Parameters() {
    }

    public static Parameters getInstance() {
        if (instance == null) {
            synchronized (Parameters.class) {
                if (instance == null) {
                    instance = new Parameters();
                }
            }
        }
        return instance;
    }


    public int getFirstSideLength() {
        return firstSideLength;
    }

    public void setFirstSideLength(int firstSideLength) {
        this.firstSideLength = firstSideLength;
    }

    public int getSecondSideLength() {
        return secondSideLength;
    }

    public void setSecondSideLength(int secondSideLength) {
        this.secondSideLength = secondSideLength;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "firstSideLength=" + firstSideLength +
                ", secondSideLength=" + secondSideLength +
                ", angle=" + angle +
                '}';
    }
}
