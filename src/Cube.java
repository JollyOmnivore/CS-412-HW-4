public class Cube extends Shape3D {
    public Cube(int size) {
        super("Cube", size);
    }


    @Override
    public double volume() {
        double volume = size * size * size;
        return volume;
    }

    @Override
    public double surfaceArea() {
        double surfaceArea = size * size ;
        surfaceArea = surfaceArea*6;
        return surfaceArea;
    }
}
