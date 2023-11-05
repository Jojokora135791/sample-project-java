package kliuev;

public class TwoDimensionalShape extends Shape {
    private boolean filling;
    public TwoDimensionalShape(String color, int[] coordinatesOfCenter, String nameOfShape, boolean filling) {
        super(color, coordinatesOfCenter, nameOfShape);
        this.filling = filling;
    }
    public void getFillingShape() {
        if (filling == true) {
            System.out.println("Фигура заполнена");
        }
        else {
            System.out.println("Фигура не заполнена");
        }
    }
    public void changeFillingShape(boolean currentStatusOfFilling) {
        filling = currentStatusOfFilling;
    }
}
