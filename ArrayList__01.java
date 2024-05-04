import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int compareTo(Point p) {
        if (this.x > p.x) return 1;
        else if (this.x < p.x) return -1;
        return 0;
    }
}

public class Array {
    public static void main(String[] args) {
        ArrayList<Point> ap = new ArrayList<>();
        ap.add(new Point(1, 2));
        ap.add(new Point(3, 4));
        ap.add(new Point(2, 0));
        System.out.println("before sorting");
        showList(ap);
        Collections.sort(ap);
        System.out.println("after sorting");
        showList(ap);
    }

    public static void showList(ArrayList<Point> ap) {
        for (int i = 0; i < ap.size(); i++) {
            System.out.println(ap.get(i).x +
                    " " + ap.get(i).y);
        }
    }

}
