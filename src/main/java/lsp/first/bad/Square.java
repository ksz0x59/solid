package lsp.first.bad;

public class Square extends Rectangle {

    public Square(int size) {
        super(size, size);
    }

    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(height);
    }

    public void setHeight(int height)
    {
        super.setHeight(height);
        super.setWidth(height);
    }
}
