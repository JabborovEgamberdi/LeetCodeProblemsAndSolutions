import java.util.Arrays;
import java.util.Stack;

public class N_232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(8);
        myQueue.push(12);
        myQueue.push(14);
        System.out.println(STR."myQueue.peek() = \{myQueue.peek()}");
        System.out.println(STR."myQueue.empty() = \{myQueue.empty()}");
        System.out.println(STR."myQueue.pop() = \{myQueue.pop()}");
        myQueue.print();
    }
}

class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int pop = s2.pop();
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return pop;
    }

    public int peek() {
        while(!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int peek = s2.peek();
        while(!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return peek;
    }

    public boolean empty() {
        return s1.isEmpty();
    }

    public void print() {
        System.out.println(Arrays.toString(s1.toArray()));
    }

}