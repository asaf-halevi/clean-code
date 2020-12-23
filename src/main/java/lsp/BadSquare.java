package lsp;

import java.lang.reflect.MalformedParametersException;

public class BadSquare extends Rectangle{

    //not substitutable
    public BadSquare(float length) {
        super(length, length);
    }

    //breaks functionality
    @Override
    public float getArea(){
        return getLength() * getLength() * getLength();
    }

    //post conditions are weakened
    @Override
    public float getPerimeter(){
        return 2 * getLength() + 2 * getWidth();
    }

    //preconditions are strengthened
    @Override
    public void setLength(float length) {
        if (length <=0 || length > 10){
            throw new ArithmeticException("length must be positive and less than 10");
        }
        super.setLength(length);
    }

    //throws new exceptions
    @Override
    public void setWidth(float width) {
        if (width <=0){
            throw new MalformedParametersException("width must be positive");
        }
        super.setWidth(width);
    }

    @Override
    public String toString() {
        return "BadSquare{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                '}';
    }
}
