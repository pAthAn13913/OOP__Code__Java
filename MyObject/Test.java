public class Test {
    public static void main(String[] args) {
        Myobject shape[] = new Myobject[5];
        shape[0] = new Sphere(2.5);
        shape[1] = new Cone(1.9, 8.9);
        shape[2] = new Cylinder(1.5, 6.5);
        shape[3] = new Cone(2.7, 5.7);
        shape[4] = new Sphere(3.5);

        double v = 0;

        for (int i = 0; i < 5; i++) {
            v += shape[i].findVolume();
        }
        System.out.println("Total result : " + v);
    }
}
