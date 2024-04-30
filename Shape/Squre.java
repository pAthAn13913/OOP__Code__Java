public class Squre extends Shape{

    public Squre(double a){
        super(a);
    }
    public  double area(){
        return getA()*getA();
    }
    public  double perimeter(){
        return  2*(getA() + getA());
    }
}
