package Array;
import java.util.*;
public class Q118 {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if(numRows == 0)
        {
            return ans;
        }

        ans.add(new ArrayList<>());
        ans.get(0).add(1);

        for(int i = 1; i < numRows; i++)
        {
            List<Integer> prevRow = ans.get(i - 1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for(int j = 1; j < prevRow.size(); j++)
            {
                newRow.add(prevRow.get(j - 1)+ prevRow.get(j));
            }

            newRow.add(1);
            ans.add(newRow);
        }

        return ans;
    }
}
