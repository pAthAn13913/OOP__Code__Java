class Print2D {
    int x, y;

    public Print2D(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Print2D constructor");
    }

    public String Display() {
        String A = "X = " + this.x + ", y = " + this.y + "";

        return A;
    }


}

class Print3D extends Print2D {
    int z;

    public Print3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("Print3D constructor");
    }

    public String Display() {

        String B = super.Display() + ", Z = " + this.z + "";

        return B;
    }

}

public class Test {
    public static void main(String[] args) {

        Print2D p2D = new Print2D(1, 2);
        System.out.println(p2D.Display());
        Print3D p3D = new Print3D(5, 4, 3);
        System.out.println(p3D.Display());


    }
}
