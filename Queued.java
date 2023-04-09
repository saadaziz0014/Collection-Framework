import java.util.LinkedList;
import java.util.Queue;

public class Queued {
    public static void main(String[] args) {
        Queue<Float> que = new LinkedList<>();

        que.offer(5.32f);
        que.offer(3.25f);
        que.offer(2.65f);
        System.out.println(que);

        // que.remove(1); for object

        que.poll();
        System.out.println(que);

        System.out.println(que.peek());

    }
}
