import java.util.HashMap;
import java.util.Map;

public class HashedMap {
    public static void main(String[] args) {
        Map<Integer, Integer> mp = new HashMap<>();

        mp.put(1, 45);
        mp.put(1, 89); // update

        mp.putIfAbsent(1, 123); // do not add

        for (Map.Entry<Integer, Integer> m : mp.entrySet()) {
            System.out.println(m);
        }

        if (mp.containsKey(1)) {
            System.out.println(mp.get(1));
        }

        System.out.println(mp.keySet());
    }
}
