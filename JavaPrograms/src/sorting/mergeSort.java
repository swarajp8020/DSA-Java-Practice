package sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 4, 3};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) { // meaning only 1 element is left
            return;
        }
        int mid = left + (right - left) / 2; //Why not (left + right)/2? Because it can overflow on huge arrays, but it works fine for DSA.
        mergeSort(arr, left, mid); // meaning only 1 element is left
        mergeSort(arr, mid + 1, right); // sort right half

        merge(arr,left,mid, right);// then merge
    }
    static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;       // pointer for left half
        int j = mid+1; // pointer for right half
        int k = 0; // pointer for right half[]
        // Step 1: Compare and pick smaller
        while (i<= mid && j<=right){
            if (arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++] =arr[j++];
            }
        }
        // Step 2: Copy leftovers (only one of these will run)
        while (i<=mid) temp[k++] =arr[i++];
        while (j<=right) temp[k++] = arr[j++];
        // Step 3: Copy sorted temp[] back into original array
        for (int x = 0; x < temp.length; x++) {
            arr[left+x] = temp[x];
        }
    }

}