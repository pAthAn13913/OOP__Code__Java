public class Rectangle {
    double width;
    double hight;
    double result;
    final int ff;





    public Rectangle(){
        //this.ff=5;
        System.out.println("i am in class 0000000 RRRRRRRRrectangle");
    }
    public Rectangle(double width, double hight) {
        this();
        //this.ff=5;
        this.width = width;
        this.hight= hight;
        System.out.println("i am in class 22222222 RRRRRRRRrectangle");
    }
    public Rectangle(double width, double hight, double c) {
        this(width,hight); //this.ff=5;
        System.out.println("i am in class 333333 RRRRRRRRrectangle");
    }
    public double getArea(){
        return width*hight;
    }
    public double getPerimeter(){
        return 2*(width+hight);
    }
    void find (){
        System.out.println(" function Ractangle");
    }
}
