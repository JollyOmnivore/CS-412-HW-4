public abstract class Shape3D extends Shape implements ThreeDimensional{


    public Shape3D(String type, int size) {
        super(type, size);

    }

    @Override
    public String toString() {
        return String.format("3D shape %5s: size =%4d volume = %.2f surface area =  %.2f", type, size, volume() , surfaceArea());
    }



}
