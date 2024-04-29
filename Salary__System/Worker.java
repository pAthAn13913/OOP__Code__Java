public class Worker extends Person{
    public Worker(int workHour) {
        super(workHour, workHour);
    }
    @Override
    public double calculateSalary() {
        double s;
        s=getWorkhour()*200;
        return s;
    }
}
