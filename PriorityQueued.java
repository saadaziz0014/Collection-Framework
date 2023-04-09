import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueued {
    public static void main(String[] args) {
        Queue<Integer> que = new PriorityQueue<>(); // min-heap
        Queue<Integer> que2 = new PriorityQueue<>(Comparator.reverseOrder()); // max-heap

        que.offer(5);
        que.offer(6);
        que.offer(1);

        que2.offer(5);
        que2.offer(6);
        que2.offer(1);

        System.out.println("Min Heap");
        System.out.println(que);
        System.out.println("Max Heap");
        System.out.println(que2);

        que.poll();

        System.out.println(que.peek());
    }
}
