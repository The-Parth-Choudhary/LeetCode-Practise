package Search;

public class Q875 {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        System.out.println(minEatingSpeed(piles, 8));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int min =1;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }

        while(min<max){
            int mid = (min+max)/2;
            if(getHours(piles,mid)>h){
                min=mid+1;
            }
            else max=mid;
        }
        return min;
    }

    public static int getHours(int[] piles, int k){
        int h=0;
        for(int i=0;i<piles.length;i++){
            h+= (int) Math.ceil((double)piles[i]/k);
        }
        return h;
    }
}
