class FinalContext {
    int abc = 10;

    public final void calculate() {
        System.out.println("calculate method is called");
    }
}

class StaticContext extends FinalContext {
    int ab = 20;
    final static int value; //You can't modify or remove this line ofcode
    private double mark = 90;
    static int count=5;

     static {
        value = 8;
    }

    int getCount() {
        return ++count;
    }

    double getMark() {
        return mark;
    }

    public static void main(String... args) {

        FinalContext a = new StaticContext();
        System.out.println(a.abc);

        StaticContext ab = new StaticContext();
        count++;
        System.out.println("count= "+ab.getCount());
        System.out.println(count);
        System.out.println("value = "+value);

        FinalContext sv = new StaticContext();
        System.out.println("mark= "+((StaticContext)sv).getMark());
        sv.calculate();
    }
}
