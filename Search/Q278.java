package Search;

public class Q278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static int firstBadVersion(int n) {
        int s=0;
        int e=n;
        while(s<e){
            int mid = s+(e-s)/2;
            if(isBadVersion(mid)==true) e=mid-1;
            else s=mid+1;
        }
        return e;
    }

    private static boolean isBadVersion(int left) {
        //this is a fake method to make Eclipse happy
        return false;
    }
}
