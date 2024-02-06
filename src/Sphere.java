class Sphere extends Shape3D {
    public Sphere(int size) {
        super("Sphere", size);
    }

    @Override
    public double volume() {
        double volume = (4.0 / 3) * Math.PI * size * size * size;
        return volume;
    }

    @Override
    public double surfaceArea() {
        double sarea = size * size * Math.PI;
        sarea = sarea * 4;
        return sarea;
    }
}
