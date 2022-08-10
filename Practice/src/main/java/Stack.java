import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Stack {
    public static void main(String[] args){
        Deque<Integer> stack1 = new ArrayDeque<>();
        Deque<Integer> stack2 = new LinkedList<>();

        stack1.push(3);
        stack1.push(1);
        stack1.push(2);
        System.out.println(stack1);
        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
        System.out.println(stack1);
    }
}
