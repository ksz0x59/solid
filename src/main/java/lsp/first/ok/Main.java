package lsp.first.ok;

public class Main {

    void clientMethod (Shape shape)
    {
        if (shape.area() != 25)
            throw new RuntimeException("Incorrect area");
    }
    public static void main(String[] args) {

        Shape square = new Square(5);
        new Main().clientMethod(square);
    }
}