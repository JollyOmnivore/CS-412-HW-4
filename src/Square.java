public class Square extends Shape2D {
    public Square(int size) {
        super("Square", size);
    }

    @Override
    public double area() {
        double area = size * size;
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = size + size + size + size;
        return perimeter;
    }
}
