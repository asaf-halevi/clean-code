package lsp;

public class Rectangle {

    private float length;
    private float width;

    public Rectangle(float length, float width) {
        setLength(length);
        setWidth(width);
    }

    public float getPerimeter() {
        return 2 * length + 2 * width;
    }

    public float getArea() {
        return length * width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length <= 0) {
            throw new ArithmeticException("length must be positive");
        }
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

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
