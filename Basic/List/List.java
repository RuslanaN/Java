import java.util.ArrayList;
import java.util.Collections;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 15; i++) {
            list.add(new Integer(i));
        }
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.add(2, 99);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.clear();
        System.out.println(list);

    }
}
