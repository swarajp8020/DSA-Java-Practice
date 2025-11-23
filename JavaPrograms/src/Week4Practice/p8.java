package Week4Practice;

import java.util.Arrays;

public class p8 {
    //kth largest
    public static void main(String[] args) {
        int[] arr = {12,4,5,2,13,52};
        int k = 3;
        int[] result = topKLargest(arr,k);
        System.out.println(Arrays.toString(result));
    }
    static int[] topKLargest(int[] arr, int k){
        int n = arr.length;
        int targetIndex = n-k;

        quickSelect(arr, 0, n-1, targetIndex);
        return Arrays.copyOfRange(arr, targetIndex, n);

    }
    static int quickSelect(int[] arr, int left, int right, int targetIndex){
        if (left<=right){
            int pivotIndex = partitionLomuto(arr, left,right);
            if (pivotIndex==targetIndex) return arr[pivotIndex];
            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right, targetIndex);
            return quickSelect(arr, left, pivotIndex-1, targetIndex);
        }
        return -1;
    }
    static int partitionLomuto(int[] arr, int left, int right){
        int  pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<=pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] =temp;
    }
}
