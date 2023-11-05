package kliuev;

public class Poligon extends TwoDimensionalShape{
    private int[] coordinatesOfFirstVertex;
    private int[] coordinatesOfSecondVertex;
    private int[] coordinatesOfThirdVertex;
    private int[] coordinatesOfFourthVertex;

    public Poligon(String color, int[] coordinatesOfCenter, String nameOfShape, boolean filling, int[] coordinatesOfFirstVertex,
                  int[] coordinatesOfSecondVertex,  int[] coordinatesOfThirdVertex,int[] coordinatesOfFourthVertex) {
        super(color, coordinatesOfCenter, nameOfShape, filling );
        this.coordinatesOfFirstVertex = coordinatesOfFirstVertex;
        this.coordinatesOfSecondVertex = coordinatesOfSecondVertex;
        this.coordinatesOfThirdVertex = coordinatesOfThirdVertex;
        this.coordinatesOfFourthVertex = coordinatesOfFourthVertex;
    }
}
