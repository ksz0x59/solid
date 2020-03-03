package lsp.first.bad;

public class Main {

    void clientMethod (Rectangle rec)
    {
        rec.setWidth(5);
        rec.setHeight(4);
        if (rec.area() != 20)
            throw new RuntimeException("Incorrect area");
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        new Main().clientMethod(rectangle);
    }
}
