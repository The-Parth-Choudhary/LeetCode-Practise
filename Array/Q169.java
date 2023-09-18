package Array;

public class Q169 {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int cnt = 0;
        int ans = 0;

        for(int i : nums){
            if(cnt == 0){
                ans = i;
            }
            if(ans == i){
                cnt++;
            }
            else{
                cnt--;
            }
        }

        return ans;
    }
}
