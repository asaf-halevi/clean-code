package lsp;

import java.lang.reflect.MalformedParametersException;

public class BadSquare extends Rectangle {

    protected static final float MAX_LENGTH = 9;
    protected static final String MAX_LENGTH_ERR =
            "Length must not exceed " + MAX_LENGTH;

    //not substitutable
    public BadSquare(float length) {
        super();
        setLength(length);
    }

    //breaks functionality
    @Override
    public float getArea() {
        return getLength() * getLength() * getLength();
    }

    @Override
    public float getPerimeter() {
        return 2 * getLength() + 2 * getWidth();
    }

    //preconditions are strengthened & throws new exception
    @Override
    public void setLength(float length) {
        if (length > MAX_LENGTH) {
            throw new MalformedParametersException(MAX_LENGTH_ERR);
        } else if (length <= 0) {
            throw new MalformedParametersException("error");
        } else {
            super.setLength(length);
        }
    }

    @Override
    public void setWidth(float width) {
    }

    @Override
    public String toString() {
        return "BadSquare{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                '}';
    }
}
