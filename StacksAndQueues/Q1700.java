package StacksAndQueues;
import java.util.*;
public class Q1700 {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};

        System.out.println(countStudents(students, sandwiches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < students.length; i++){
            st.push(sandwiches[students.length - i - 1]);
            queue.add(students[i]);
        }

        int hungryStudent = 0;

        while(true){
            if(queue.peek() == st.peek())
            {
                hungryStudent = 0;
                queue.remove();
                st.pop();
            }
            else
            {
                hungryStudent++;
                queue.add(queue.remove());
            }

            if(hungryStudent == queue.size())
            {
                break;
            }
        }
        return hungryStudent;
    }
}
