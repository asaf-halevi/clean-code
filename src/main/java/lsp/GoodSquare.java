package lsp;

public class GoodSquare extends Rectangle{

    public GoodSquare(float length) {
        super(length, length);
    }

    public GoodSquare(float length, float width) {
        super(length, length);
    }

    public float getPerimeter(){
        return verifyPerimeter(4 * getLength());
    }

    public float getArea(){
        return getLength() * getLength();
    }

    @Override
    public void setWidth(float width) {
        System.err.println("Width will be ignored for square");
    }

    @Override
    public String toString() {
        return "GoodSquare{" +
                "length=" + getLength() +
                '}';
    }
}
