import java.util.ArrayList;
import java.util.Collections;

public class arrrr {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);

        Collections.sort(al, Collections.reverseOrder());          //__Descending__order

        Collections.sort(al);                                    //__Ascending__order

    }
}
