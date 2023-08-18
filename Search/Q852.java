package Search;

public class Q852 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int s=1;
        int e=arr.length-2;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid+1]) e=mid-1;
            else s=mid+1;
        }
        return s;
    }
}
