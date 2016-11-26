package model;

public class Parameters {

    private int firstSideLength;
    private int secondSideLength;
    private int angle;

    public Parameters() {
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
