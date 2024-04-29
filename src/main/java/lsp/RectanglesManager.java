package lsp;

import java.util.ArrayList;
import java.util.List;

public class RectanglesManager {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        //Parent
        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(6, 7));

        //replace with BadSquare / GoodSquare (and replace constructor)
        //rectangles.add(new Rectangle(10, 10));//valid parameter will NOT be accepted
        //rectangles.add(new Rectangle(0, 0));//invalid parameter will be accepted

        for (Rectangle r : rectangles) {
            System.out.println(r + " | perimeter: " + r.getPerimeter() + " | area: " + r.getArea());
        }
    }
}
