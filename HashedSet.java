import java.util.HashSet;
import java.util.Set;

public class HashedSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // O(n)

        set.add(5);
        set.add(8);
        set.add(9);

        System.out.println(set);

        set.remove(8);
        // set.remove(45); return true or false

        System.out.println(set.contains(8));

        System.out.println(set.size());

        set.clear();
    }
}
