package sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,68,32,23};
        bubbleSort(arr);
        System.out.print("Sorted arrays: ");
        for(int n: arr){
            System.out.print(n+ " ");
        }
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
    }
}
