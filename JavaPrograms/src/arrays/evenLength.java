package arrays;

import java.util.Arrays;

public class evenLength {
    void evenLengthArray(int[] arr){
        for (int left = 0, right=arr.length-1; left < right; left++, right--) {
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {};
        evenLength evenLength = new evenLength();
        evenLength.evenLengthArray(arr);
        System.out.println("Odd Length Arrays: "+ Arrays.toString(arr));
    }
}
