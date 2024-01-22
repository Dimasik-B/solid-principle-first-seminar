package srp1;

import srp1.figure.Paintable;
import srp1.figure.SquarePainter;
import srp1.figure.Point;
import srp1.figure.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        Paintable painter = new SquarePainter();
        painter.draw(square);
    }
}
