public class A {
    public void m() {

    }

    public void m1() {

    }
}

class B extends A {

    public void m1() {

    }

    public static void main(String[] args) {
        A a = new B();
        ((B) a).m1();
        // a.m1();
    }
}
