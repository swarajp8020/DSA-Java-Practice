package WeekdayPractice;

import java.util.Arrays;

public class practice21Nov {
    public static void main(String[] args) {
        int[] arr = {8,6,4,-1,0,23,5};
        quickSortDNF(arr, 0 ,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //quicksort DNF Pattern (peek 2 times)
    static void quickSortDNF(int[] arr, int left, int right){
        if (left>= right)return;
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
                swap1(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            } else {
                swap1(arr, mid,high);
                high--;
            }
        }
        return new int[] {low, high};
    }
    static void swap1(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //quicksort mid Pivot pattern
    static void quickSortHoare(int[] arr, int left, int right){
        if (left>= right)return;
        int pivotIndex = partitionH(arr, left,right);
        quickSortHoare(arr, left, pivotIndex);
        quickSortHoare(arr,pivotIndex+1,right);
    }
    static int partitionH(int[] arr, int left, int right){
        int pivot = arr[(right+left)/2];
        while (true){
            while (arr[left]<pivot){left++;}
            while (arr[right]>pivot) right--;

            if (left>=right) return right;

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }


//    quickSort Lomuto Pattern(peek 2 times)
    static void quickSort(int[] arr, int left, int right){
        if(left>=right) return;
        int pivotIndex = partition(arr, left, right);
        quickSort(arr, left, pivotIndex-1);
        quickSort(arr, pivotIndex+1, right);
    }
    static int partition (int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<=pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] = temp;
    }

    //mergesort
    static void mergeSort(int[] arr, int left, int right){
        if (left>=right)return;
        int mid = left+(right-left)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left,mid,right);
    }
    static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i<= mid && j<= right){
            if (arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }
        while (i<=mid) temp[k++] = arr[i++];
        while (j<=right) temp[k++] = arr[j++];

        for (int l = 0; l < temp.length; l++) {
            arr[left+l] = temp[l];
        }
    }
}
