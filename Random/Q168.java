package Random;

public class Q168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        while(columnNumber!=0){
            columnNumber--;
            char c = (char)(columnNumber%26+65);
            str.append(c);
            columnNumber/=26;
        }
        str.reverse();
        String ans = str.toString();
        return ans;
    }
}
