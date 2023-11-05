package kliuev;

public class Shape {
    private String color;
    private int[] coordinatesOfCenter;
    private String nameOfShape;

    public Shape(String color,
                 int[] coordinatesOfCenter,
                 String nameOfShape) {
        this.color = color;
        this.coordinatesOfCenter = coordinatesOfCenter;
        this.nameOfShape = nameOfShape;

    }

    public String getColor() {
        return color;
    }
    public  int[] getCoordinatesOfCenter() {
        return  coordinatesOfCenter;
    }
    public String getNameOfShape() { return nameOfShape; }
    public void moveCenter(int[] newCoordinate) {
        coordinatesOfCenter = newCoordinate;
    }
    public void changeColor(String newColor) {
        color = newColor;
    }
}
