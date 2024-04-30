public class Test {
    public static void main(String[] args) {
        Shape c, s, r;
        c = new Circle(2);
        s = new Squre(3);
        r = new Rectangle(6, 7);

        System.out.println("\nCircle area : " + c.area());
        System.out.println("Circle perimeter : " + c.perimeter());

        System.out.println("\nSqure area : " + s.area());
        System.out.println("Squre perimeter : " + s.perimeter());

        System.out.println("\nRectangle area : " + r.area());
        System.out.println("Rectangle perimeter : " + r.perimeter());

    }
}
