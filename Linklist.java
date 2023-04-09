import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(5);
        ll.add(8);
        System.out.println(ll);

        ll.addLast(5);
        ll.addFirst(8);

        ll.remove(1);

        System.out.println(ll);
    }
}
