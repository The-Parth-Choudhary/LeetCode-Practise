package StacksAndQueues;
import java.util.*;
public class Q1381 {
    public static void main(String[] args) {

    }
}

class CustomStack {
    Stack<Integer> st;
    int size;
    public CustomStack(int maxSize) {
        st = new Stack<>();
        size = maxSize;
    }

    public void push(int x) {
        if(st.size() < size){
            st.push(x);
        }
        else{
            return;
        }
    }

    public int pop() {
        if(st.isEmpty()){
            return -1;
        }
        return st.pop();
    }

    public void increment(int k, int val) {
        Stack<Integer> temp = new Stack<>();

        while(!st.isEmpty()){
            temp.push(st.pop());
        }

        while(!temp.isEmpty()){
            if(k > 0){
                st.push(temp.pop() + val);
                k--;
            }
            else{
                st.push(temp.pop());
            }
        }
    }
}
