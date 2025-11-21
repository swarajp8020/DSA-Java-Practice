package WeekdayPractice;

import java.util.Arrays;

public class practice21Nov {
    public static void main(String[] args) {
        int[] arr = {8,6,4,-1,0,23,5};
        quickSortHoare(arr, 0 ,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

//    quickSortMidPivot (1 peek)
    static void quickSortHoare(int[] arr, int left, int right){
        if (left>=right)return;
        int pivotIndex = partitionHoare(arr, left, right);
        quickSortHoare(arr, left, pivotIndex-1);
        quickSortHoare(arr, pivotIndex+1, right);
    }
    static int partitionHoare(int[] arr, int left, int right){

        int pivot = arr[(left+right)/2];
        while (true){
            while (left<right){
                while (arr[left]<pivot)left++;
                while (arr[right]>pivot)right--;

                while (left>=right) return right;

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }


    //quicksortDNF (no peek)
    static void quickSortDNF(int[] arr, int left, int right){
        if (left>=right)return;
        int[] bound = partitionDNF(arr, left, right);
        int low = bound[0];
        int high = bound[1];

        quickSortDNF(arr, left, low-1);
        quickSortDNF(arr, high+1, right);
    }
    static int[] partitionDNF(int[] arr, int left, int right){
        int pivot = arr[(left+right)/2];
        int low = left;
        int mid = left;
        int high = right;

        while (mid<=high){
            if (arr[mid]<pivot){
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            } else {
                swap(arr, high, mid);
                high--;
            }
        }
        return new int[]{low, high};

    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
