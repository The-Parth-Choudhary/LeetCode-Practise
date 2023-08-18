package Search;

public class Q69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }

    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int mid = -1;

        while(start <= end){
            mid = start + (end - start)/2;
            if(mid * mid == x) return mid;
            else if((long)mid*(long)mid >x) end = mid - 1;
            else start = mid+1;
        }
        return Math.round(end);
    }
}
