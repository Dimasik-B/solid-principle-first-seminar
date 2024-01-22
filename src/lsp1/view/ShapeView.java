package lsp1.view;

import lsp1.shape.Quadrilateral;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadrilateral rectangle;

    public ShapeView(Quadrilateral rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(rectangle.getArea());
    }
}
