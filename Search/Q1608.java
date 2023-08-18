package Search;

public class Q1608 {
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }

    public static int specialArray(int[] nums) {
        for(int i=1;i<=nums.length;i++){
            int cnt=0;
            for(int num:nums){
                if(num>=i) cnt++;
            }
            if(cnt==i) return i;
        }
        return -1;
    }
}
