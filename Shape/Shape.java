public abstract class Shape {
    private double a;

    public Shape(double a) {
        this.a = a;
    }

    public abstract double area();

    public abstract double perimeter();

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

}
