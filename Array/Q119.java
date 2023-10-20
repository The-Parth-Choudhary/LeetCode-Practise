package Array;

import java.util.*;

public class Q119 {
    public static void main(String[] args) {
        System.out.println(getRow(4));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        list.add(1);

        for(int i = 1; i <= rowIndex; i++){
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for(int j = 1; j < list.size(); j++){
                newRow.add(list.get(j-1) + list.get(j));
            }

            newRow.add(1);
            list = newRow;
        }

        return list;
    }
}
