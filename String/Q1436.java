package String;

import java.util.*;

public class Q1436 {
    public static void main(String[] args) {

    }

    public static String destCity(List<List<String>> paths) {

        HashSet<String> set = new HashSet<>();

        for (List<String> path : paths) {
            set.add(path.get(0));
        }

        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!set.contains(dest)) {
                return dest;
            }
        }

        return "";
    }
}
