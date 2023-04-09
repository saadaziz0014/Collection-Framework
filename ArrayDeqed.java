import java.util.ArrayDeque;

public class ArrayDeqed {
    public static void main(String[] args) {
        ArrayDeque<String> adque = new ArrayDeque<>();

        adque.offerFirst("Saad");
        adque.offerFirst("Muhammad");
        adque.offerLast("Aziz");

        System.out.println(adque);

        adque.pollLast();

        System.out.println(adque.peekLast());
    }
}
