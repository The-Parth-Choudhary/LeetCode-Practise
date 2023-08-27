package StacksAndQueues;
import java.util.*;
public class Q225 {
    public static void main(String[] args) {

    }
}

class MyStack {
    Queue<Integer> queue;
    int top=0;
    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        top=x;
    }

    public int pop() {
        Queue<Integer> temp = new LinkedList<>();
        while(queue.size()>1){
            temp.add(queue.remove());
        }
        int ans = queue.remove();
        while(!temp.isEmpty()){
            int a=temp.remove();
            queue.add(a);
            top=a;
        }
        return ans;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
