import java.util.Set;
import java.util.TreeSet;

public class TreedSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); // sorted O(logn)

        set.add(5);
        set.add(65);
        set.add(1);

        System.out.println(set);

        set.remove(8);
        // set.remove(45); return true or false

        System.out.println(set.contains(8));

        System.out.println(set.size());

        set.clear();
    }
}
