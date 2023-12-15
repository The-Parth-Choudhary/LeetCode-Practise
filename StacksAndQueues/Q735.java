package StacksAndQueues;

import java.util.*;

public class Q735 {
    public static void main(String[] args) {
        int[] asteroids = {-2, -1, 1, 2};

        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];

            if (st.isEmpty() || curr > 0) {
                st.push(curr);
            } else {
                while (true) {
                    int peek = st.peek();

                    if (peek < 0) {
                        st.push(curr);
                        break;
                    } else if (peek == -curr) {
                        st.pop();
                        break;
                    } else if (peek > -curr) {
                        break;
                    } else {
                        st.pop();
                        if (st.isEmpty()) {
                            st.push(curr);
                            break;
                        }
                    }
                }
            }
        }

        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}
