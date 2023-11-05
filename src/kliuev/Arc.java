package kliuev;

public class Arc extends OneDimensionalShape{
    private String nameOfShape;
    private int radius;

    public Arc(String color, int[] coordinatesOfCenter, String nameOfShape, int[] firstPoint, int[] secondPoint, int radius) {
        super(color, coordinatesOfCenter, nameOfShape, firstPoint, secondPoint);
        this.nameOfShape = nameOfShape;
        this.radius = radius;


    }
    public int getRadius() {return radius;}
}
