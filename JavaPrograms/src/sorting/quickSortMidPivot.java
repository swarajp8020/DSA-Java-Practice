package sorting;

import java.util.Arrays;
//Hoare's partitioning algorithm i
//A. QuickSort with Middle Pivot (Fixed version) pivot = middle element
//Just like choosing the middle paper/book.
//left pointer
//Walks from the start until it finds something wrong
//(something bigger than pivot).
//right pointer
//Walks from the end until it finds something wrong
//(something smaller than pivot).
//If both found wrong elements → swap.
//That’s literally it.
//When left passes right → stop.
//Because left side is now full of small stuff,
//right side full of big stuff.
public class quickSortMidPivot {
    public static void main(String[] args) {
        int[] arr = {7,5,8,2,4,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int left, int right){
        if (left>= right)return;
        int pivotIndex = partition(arr, left,right);
        quickSort(arr, left, pivotIndex);
        quickSort(arr, pivotIndex+1,right);
    }
    static int partition(int[] arr, int left, int right){
        int pivot = arr[(left+right)/2];
        while (true){
            while (arr[left]<pivot) left++;
            while (arr[right]>pivot) right--;

            if (left>=right) return right; // remember this

            int temp = arr[left];
            arr[left] =arr[right];
            arr[right] =temp;

            left++;
            right--;
        }

    }
}
