import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    String name;
    int id;
    double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public void showInfo() {
        System.out.println("ID : " + id + " Name : " + name + " GPA : " + gpa);
    }

    public static Comparator<Student> sortMethod = new Comparator<Student>() {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.gpa > o2.gpa) return 1;
            else if (o1.gpa < o2.gpa) return -1;           //nomani sir
            return 0;
        }
    };

    public int compareTo(Student s) {
        if (this.id > s.id) return 1;
        else if (this.id < s.id) return -1;           //romij sir
        return 0;
    }
}

class Student_ArrayList {
    public static void main(String[] args) {
        ArrayList<Student> s_Array = new ArrayList<>();
        Student s1 = new Student("Arafat", 109, 4.00);
        Student s2 = new Student("Khan", 105, 1.00);
        Student s3 = new Student("Pathan", 103, 2.00);
        Student s4 = new Student("Omor", 102, 3.10);
        Student s5 = new Student("Ali", 101, 4.10);

        s_Array.add(s1);
        s_Array.add(s2);
        s_Array.add(s3);
        s_Array.add(s4);
        s_Array.add(s5);

        System.out.println("1st ");
        for (int i = 0; i < s_Array.size(); i++) {
            s_Array.get(i).showInfo();
        }

        System.out.println("2nd ");
        s_Array.sort(Student.sortMethod);
        for (int i = 0; i < s_Array.size(); i++) {
            s_Array.get(i).showInfo();
        }

        System.out.println("3rd ");
        Collections.sort(s_Array);
        for (int i = 0; i < s_Array.size(); i++) {
            s_Array.get(i).showInfo();
        }
    }

}
