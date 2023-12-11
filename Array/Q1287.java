package Array;

public class Q1287 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }

    public static int findSpecialInteger(int[] arr) {
        int num = arr[0];
        int count = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == num){
                count++;
            }
            else{
                num = arr[i];
                count = 1;
            }
            if(count > arr.length/4){
                return arr[i];
            }
        }

        return arr[0];
    }
}
