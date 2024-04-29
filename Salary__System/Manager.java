public class Manager extends Person{

    private int exp;
    public Manager( int basic,int exp) {
        super(basic, basic);
        this.exp=exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public double calculateSalary() {
        double r;
        r=getBasic()+exp*5000;
        return r;
    }
}
