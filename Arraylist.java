import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> arrl = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        arrl.add("Saad");
        arrl.add("Aziz");

        arrl.add(0, "Muhammad");

        System.out.println(arrl.get(0));

        arrl.remove(2);
        arrl.remove("Saad");
        System.out.println(arrl);

        li.add(5);
        li.add(8);
        li.add(7);

        Iterator<Integer> itr = li.iterator();
        while (itr.hasNext()) {
            System.out.println("Value = " + itr.next());
        }
    }

}