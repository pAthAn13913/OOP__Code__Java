public class Circle extends Shape{
    public Circle(double r){
        super(r);
    }
    public  double area(){
        return 3.1416*getA()*getA();
    }
    public  double perimeter(){
        return  2*3.1416*getA();
    }
}
