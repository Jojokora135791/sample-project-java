package kliuev;

public class Line extends OneDimensionalShape{
    private String nameOfShape;

    public Line(String color, int[] coordinatesOfCenter, String nameOfShape, int[] firstPoint, int[] secondPoint) {
        super(color, coordinatesOfCenter, nameOfShape, firstPoint, secondPoint);
        this.nameOfShape = nameOfShape;
    }
}
