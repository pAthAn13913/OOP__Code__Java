public class Main {
    public static void main(String[] args) {

        Person person[]= new Person[4];

        person[0]=new Officer(1000,2,5);
        person[1]=new Worker(10);
        person[2]=new Worker(12);
        person[3]=new Manager(50000,5);

        for(Person p : person){

            System.out.println("Salary = "+p.calculateSalary());

          }
    }
}
