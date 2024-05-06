public class Point {
    int x, y;
    static int count = 0;

    public Point(int x, int y) {
        count++;
        try {
            if (count > 2) {
                throw new RuntimeException();
            }
            this.x = x;
            this.y = y;
        } catch (RuntimeException e) {
            System.err.println("Can't be created 3 object or more");
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(4, 5);
        Point p2 = new Point(5, 6);
        // Point p3 = new Point(6, 7);

    }
}
