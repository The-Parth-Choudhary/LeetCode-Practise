package Search;

public class Q754 {
    public static void main(String[] args) {
        System.out.println(reachNumber(3));
    }

    public static int reachNumber(int target) {
        target = Math.abs(target);
        int curr=0;
        int i=0;
        if(target == 0) return 0;
        while(curr<target){
            curr+=i;
            i++;
        }
        while((curr-target)%2!=0){
            curr+=i;
            i++;
        }
        return i-1;
    }
}
