package Practice.Week8Practice.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {
    static void main(String[] args) {
        int[] arr = {3,4,5,68,32,23};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
