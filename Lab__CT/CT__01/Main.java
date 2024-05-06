//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Point a= new Point(0,0);
        Point b= new Point(5,0);
        Point c= new Point(5,4);
        Point d= new Point(0,4);
        Squre r1=new Squre(a,b,c,d);
        double ab =r1.len(a,b);//System.out.println("ab = "+ab);
        double bc =r1.len(b,c);//System.out.println("bc = "+bc);
        double ac = r1.len(a,c);System.out.println("01.Diagonal = "+ac);                        //....01
        double pmtr =2*(ab+bc);System.out.println("02.Permeter = "+pmtr);                      //....02
        Point p= new Point(2,2);                                                        //....03
        if(r1.findpoint(p)==1) System.out.println("03.Point inside = Yes");
        else System.out.println("03.Point inside = No");
        Point w= new Point(1,1);
        Point x= new Point(1,2);
        Point y= new Point(2,3);
        Point z= new Point(1,3);
        Squre r2=new Squre(a,b,c,d);
        r1.RectangleInsideRectangle(r2);                                                  //....04


        }

    }
