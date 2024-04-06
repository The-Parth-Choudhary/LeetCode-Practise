package String;

public class Q1249 {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }

    public static String minRemoveToMakeValid(String s) {
        int cnt = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                cnt++;
            } else if (arr[i] == ')') {
                if (cnt == 0) {
                    arr[i] = '*';
                } else {
                    cnt--;
                }
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (cnt > 0 && arr[i] == '(') {
                arr[i] = '*';
                cnt--;
            }
        }

        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '*') {
                arr[p++] = arr[i];
            }
        }

        String ans = new String(arr).substring(0, p);
        return ans;
    }
}
