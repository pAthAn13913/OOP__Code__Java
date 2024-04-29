//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(4,5);
        Square s= new Square(6);
        System.out.println("Area of rectangle = "+r.getArea());
        System.out.println("Perimeter of rectangle = "+r.getPerimeter());

        System.out.println("Area of square = "+s.getArea());
        System.out.println("Perimeter of square = "+s.getPerimeter());

    }
}

 class test {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(4,5);
        System.out.println("OK");
        Square s= new Square(6,5); System.out.println("OK");
        Rectangle rs=new Square(5,6); System.out.println("OK");
r.find();
s.find();


rs.find();

//rs.find(4);
        ((Square)rs).find(4);
        ((Square)rs).find(1);


    }
}