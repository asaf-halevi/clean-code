package lsp;

import java.util.ArrayList;
import java.util.List;

public class RectanglesManager {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(6, 7));

        // replace with bad/good square
        rectangles.add(new Rectangle(10, 10));
        try {
            rectangles.add(new Rectangle(0, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception, as expected: " + e.getMessage());
        }

        for (Rectangle r : rectangles) {
            System.out.println(r + " | perimeter: " + r.getPerimeter() + " | area: " + r.getArea());
        }
    }
}
