public class Sphere extends Myobject {
    public Sphere(double r) {
        super(r);
    }

    public double findVolume() {
        double v;
        v=(4.0/3)*3.1416*getR()*getR()*getR();
        return v;
    }
}