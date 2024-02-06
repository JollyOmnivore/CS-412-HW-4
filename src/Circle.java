public class Circle extends Shape2D {
    public Circle(int size) {
        super("Circle", size);
    }

    @Override
    public double area() {

        double area = size * size * Math.PI;
        return area;
    }

    @Override
    public double perimeter() {
        double radius = size;
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}