public class Rectangle extends Shape {
    private double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public void setB(double a) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public double area() {
        return getA() * this.b;
    }

    public double perimeter() {
        return 2 * (getA() + this.b);
    }

}
