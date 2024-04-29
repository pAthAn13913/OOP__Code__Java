 public class Squre {

    Point p1,p2,p3,p4;
    public Squre(Point p1,Point p2,Point p3,Point p4){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
    }
    public double len(Point A,Point B){

      double L= Math.sqrt (( (A.x-B.x)*(A.x-B.x))+((A.y-B.y)*(A.y-B.y)));

        return L;
    }

    public int findpoint(Point p){
        if(p.x>=this.p1.x && p.x<=this.p2.x && p.y >= this.p1.y && p.y <= this.p4.y ) return 1;
        else return 0;
    }

     public void RectangleInsideRectangle(Squre r){
        if ( (findpoint(r.p1)==1) && (findpoint(r.p1)==1) && (findpoint(r.p1)==1) && (findpoint(r.p1)==1) )
             System.out.println("04.Another rectangle inside = Yes");
         else System.out.println("04.Another rectangle inside = No");
     }


 }
