import java.util.Stack;

public class Stacked {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(5);
        stk.push(8);

        System.out.println(stk.peek());

        System.out.println(stk.pop());

    }
}
