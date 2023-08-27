package StacksAndQueues;
import java.util.*;
public class Q232 {

}

class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int ans = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return ans;
    }

    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int ans = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return ans;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
