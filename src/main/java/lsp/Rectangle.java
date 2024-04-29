package lsp;

public class Rectangle {

    protected final static float MAX_PERIMETER_DEFINED_BY_CLIENT = 35;
    protected final static String MAX_PERIMETER_DEFINED_BY_CLIENT_ERR =
            "Client will not accept perimeters greater than " + MAX_PERIMETER_DEFINED_BY_CLIENT;

    private float length;
    private float width;

    public Rectangle(float length, float width) {
        setLength(length);
        setWidth(width);
    }

    // return the perimeter after verification
    public float getPerimeter() {
        return verifyPerimeter(2 * length + 2 * width);
    }

    // perimeter must not exceed a given max size
    protected float verifyPerimeter(float perimeter) {
        if (perimeter > MAX_PERIMETER_DEFINED_BY_CLIENT) {
            throw new ArithmeticException(MAX_PERIMETER_DEFINED_BY_CLIENT_ERR);
        }
        return perimeter;
    }

    public float getArea() {
        return length * width;
    }

    public float getLength() {
        return length;
    }

    // length must be a positive number
    public void setLength(float length) {
        if (length <= 0) {
            throw new ArithmeticException("length must be positive");
        }
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    // width must be a positive number
    public void setWidth(float width) {
        if (width <= 0) {
            throw new ArithmeticException("width must be positive");
        }
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
