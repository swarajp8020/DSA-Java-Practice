package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr ={2,4,1,5,23};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        for (int n: arr){
            System.out.println(n);
        }
    }
    static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int key = arr[i];
            int j = i-1;

            while (j>= 0 && arr[j]>key){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
