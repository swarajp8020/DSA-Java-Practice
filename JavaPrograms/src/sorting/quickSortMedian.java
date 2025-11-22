package sorting;

import java.util.Arrays;

public class quickSortMedian {
    public static void main(String[] args) {
        int[] arr = {6,5,1,7,2,0};
        quickSortMedian(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSortMedian(int[] arr, int left, int right){
        if (left>= right) return;
        int medianIndex = medianSort(arr, left, right);
        swap(arr, medianIndex, right);

        int pivotIndex = partition(arr, left, right);
        quickSortMedian(arr, left, pivotIndex-1);
        quickSortMedian(arr, pivotIndex+1, right);
    }
    static int medianSort(int[] arr, int left, int right){
        int mid = left + (right-left)/2;

//        while (arr[left]>arr[mid])swap(arr, left,mid);
//        while (arr[right]<arr[mid])swap(arr, mid,right);
//        while (arr[left]>arr[mid])swap(arr, left,mid);
        //while should be if
        //We don’t want loops there — only single comparisons.
        //Reason:
        //Repeated swaps can re-break previously fixed ordering or even loop infinite.
        if (arr[left]>arr[mid])swap(arr, left,mid);
        if (arr[right]<arr[mid])swap(arr, mid,right);
        if (arr[left]>arr[mid])swap(arr, left,mid);

        return mid;
    }
    static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[ a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
