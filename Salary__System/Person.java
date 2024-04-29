public abstract class Person implements Salary {
    private int workhour;
    private int basic;

    public Person(int workhour, int basic) {
        this.workhour = workhour;
        this.basic = basic;
    }

    public int getBasic() {
        return basic;
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public int getWorkhour() {
        return workhour;
    }

    public void setWorkhour(int workhour) {
        this.workhour = workhour;
    }
}
