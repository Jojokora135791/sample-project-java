package kliuev;

public class Dot extends ZeroDimensionalShape{

    private String nameOfShape;
    public Dot(String color, int[] coordinatesOfCenter, String nameOfShape) {
        super(color, coordinatesOfCenter, nameOfShape);
        this.nameOfShape = nameOfShape;
    }

}
