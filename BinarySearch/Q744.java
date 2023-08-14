package BinarySearch;

public class Q744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'a'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(letters[m]<=target) s=m+1;
            else e=m-1;
        }
        // if(s>letters.length-1){

        // }
        return letters[s%letters.length];
    }
}
