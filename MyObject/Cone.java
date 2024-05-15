public class Cone extends Cylinder{
    public Cone(double r,double h){
        super(r,h);
    }
    public double findVolume() {
        double v;
        v = (1.0/3)*3.1416 * getR() * getR() * getH();
        return v;
    }
}
