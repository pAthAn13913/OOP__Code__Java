public class FoodItem {
    public double c, z;
    public String t;

    public double getprice(double amount) {
        return c * amount * (1 + z / 100);
    }
}

class Vegitable extends FoodItem {
    public int a;

    public void setperamiter() {
        if (t == "Spinach") {
            c = 20;
            z = 15;
        } else if (t == "Cauliflower") {
            c = 25;
            z = 18;
        }
    }

    public Vegitable(String t) {
        this.t = t;
    }
}

class Fish extends FoodItem {
    public int b = 8;

    public void setperamiter() {
        if (t == "Carp") {
            c = 20;
            z = 15;
        } else if (t == "medium") {
            c = 25;
            z = 20;
        } else if (t == "small") {
            c = 200;
            z = 25;
        }
    }

    public Fish(String t) {
        this.t = t;
    }
}

class MyTest {
    public static void main(String[] args) {

        FoodItem fv, ff;
        fv = new Vegitable("Cauliflower");
        ff = new Fish("small");
        System.out.println(((Fish) ff).b);
//        ((Vegitable)fv).setperamiter();
//        ((Fish)ff).setperamiter();
//        double price = fv.getprice(2) + ff.getprice(3);
//        System.out.println(price);
//        System.out.println(fv.getprice(2)+ff.getprice(3));
//       System.out.println(ff.getprice(3));
//

    }
}
