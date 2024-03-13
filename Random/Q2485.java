package Random;

public class Q2485 {
    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }

    public static int pivotInteger(int n) {
        double sum = Math.sqrt(n*(n+1)/2);
        if(sum - (int)sum > 0){
            return -1;
        }

        return (int)sum;
    }
}
