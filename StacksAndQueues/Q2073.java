package StacksAndQueues;
import java.util.*;
public class Q2073 {
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        System.out.println(timeRequiredToBuy(tickets, 0));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < tickets.length; i++)
        {
            queue.add(i);
        }

        int i = k;
        int personTicket = tickets[k];

        while(!queue.isEmpty())
        {
            time++;

            int front = queue.remove();

            tickets[front]--;

            if(front == k && tickets[front] == 0)
            {
                break;
            }
            else if(tickets[front] == 0)
            {
                continue;
            }
            queue.add(front);
        }

        return time;
    }
}
