public class Officer extends Person {
    private int exp;
    private int overTime;
    public Officer(int basic,int exp, int overTime) {

        super(basic, basic);
        this.exp=exp;
        this.overTime=overTime;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public int getOverTime() {
        return overTime;
    }

    @Override
    public double calculateSalary() {
        double s;
        s = getBasic() + exp+1000  + overTime*200;
        return s;
    }
}
