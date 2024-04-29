public class Logarithms {

    public int b;
    public double x;

    public Logarithms(int b, double x) {
        this.b = b;
        this.x = x;
    }

    public Logarithms(Logarithms existing) {
        this.b = existing.b;
        this.x = existing.x;
    }

    public Logarithms() {
    }

    public double myfunc() {
        if (b <= 0 || x <= 0) {
            return 0;
        }
        return (Math.log(x) / Math.log(b));
    }
}

class Main {

    public static void main(String[] args) {
        Logarithms log1 = new Logarithms(2, 9);
        Logarithms log2 = new Logarithms(log1);
        Logarithms log3 = new Logarithms();
        System.out.println(log1.b + " " + log1.x + " " + log1.myfunc());
        System.out.println(log2.b + " " + log2.x + " " + log2.myfunc());
        System.out.println(log3.b + " " + log3.x + " " + log3.myfunc());

    }

}