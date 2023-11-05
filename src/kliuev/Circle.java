package kliuev;

public class Circle extends TwoDimensionalShape{
    private int diameter;
    public Circle(String color, int[] coordinatesOfCenter, String nameOfShape, boolean filling, int diameter) {
        super(color, coordinatesOfCenter, nameOfShape, filling);
        this.diameter = diameter;
    }
}
