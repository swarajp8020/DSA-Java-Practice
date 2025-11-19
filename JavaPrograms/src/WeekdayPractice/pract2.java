package WeekdayPractice;

public class pract2 {
    public static void main(String[] args) {
        int[] arr = {9,-5,3,1,6};
        int result = mergeSort(arr, 0, arr.length-1);
        System.out.println("con "+result);
    }
    static int mergeSort(int[] arr, int left, int right){
        if (left>= right)return 0;
        int mid= left+(right-left)/2;
        int leftCount = mergeSort(arr, left, mid);
        int rightCount = mergeSort(arr, mid+1, right);
        int mergeCount = merge(arr, left, mid, right);
        return leftCount+rightCount+mergeCount;
    }
    static int merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        int inversion = 0;

        while (i<=mid&&j<=right){
            if (arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            } else {
                temp[k++]= arr[j++];
                inversion += (mid-i+1);
            }
        }
        while (i<=mid){
            temp[k++] = arr[i++];
        }
        while (j<=right){
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[left+l] = temp[l];
        }
        return inversion;
    }
}
