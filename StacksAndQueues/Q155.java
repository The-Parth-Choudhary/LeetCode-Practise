package StacksAndQueues;
import java.util.*;
public class Q155 {
    public static void main(String[] args) {
        
    }
}

class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        if(minStack.isEmpty() || val<=minStack.peek()) minStack.push(val);
        else minStack.push(minStack.peek());
        stack.push(val);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
