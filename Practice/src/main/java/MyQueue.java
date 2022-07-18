import java.util.Stack;

public class MyQueue {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.push(1);
        mq.push(2);
        mq.push(3);
        System.out.println(mq.pop());
        System.out.println(mq);
    }
    private Stack<Integer> oldStack;
    private Stack<Integer> newStack;
    public MyQueue(){
        oldStack = new Stack<>();
        newStack = new Stack<>();
    }
    public void push(int x) {
        oldStack.push(x);
    }

    public int pop() {
        if(newStack.empty()){
            while(!oldStack.empty()){
                newStack.push(oldStack.pop());
            }
        }else{
            return newStack.pop();
        }
        return newStack.pop();
    }

    public int peek() {
        if(newStack.empty()){
            while(!oldStack.empty()){
                newStack.push(oldStack.pop());
            }
        }else{
            return newStack.peek();
        }
        return newStack.peek();
    }

    public boolean empty() {
        if(oldStack.empty() && newStack.empty()){
            return true;
        }
        return false;
    }
}
