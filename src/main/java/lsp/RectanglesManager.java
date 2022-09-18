package lsp;

import java.util.ArrayList;
import java.util.List;

public class RectanglesManager {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        //Parent
        rectangles.add(new Rectangle(3, 4));
        rectangles.add(new Rectangle(6, 7));

        //Invalid child
//        rectangles.add(new BadSquare(50));//valid parameter will NOT be accepted
//        rectangles.add(new BadSquare(9));//invalid parameter will be accepted

        //Valid child
//        rectangles.add(new GoodSquare(50));//valid parameter will be accepted
//        rectangles.add(new GoodSquare(9));//invalid parameter will NOT be accepted

        for (Rectangle r : rectangles) {
            System.out.println(r + " | perimeter: " + r.getPerimeter() + " | area: " + r.getArea());
        }
    }
}
