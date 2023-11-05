package kliuev;

public class OneDimensionalShape extends Shape {

    private int[] firstPoint;
    private int[] secondPoint;

    public OneDimensionalShape(String color, int[] coordinatesOfCenter, String nameOfShape, int[] firstPoint, int[]secondPoint) {
        super(color, coordinatesOfCenter, nameOfShape);
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public int[] getFirstPoint() { return firstPoint;}
    public int[] getSecondPoint() { return secondPoint;}

}
