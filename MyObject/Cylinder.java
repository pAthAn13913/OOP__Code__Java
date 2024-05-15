public class Cylinder extends Myobject {
    private double h;

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public double findVolume() {
        double v;
        v = 3.1416 * getR() * getR() * h;
        return v;
    }
}
