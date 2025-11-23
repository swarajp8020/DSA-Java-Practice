package Week4Practice;
////🎯 Problem: Sort Colors (Dutch National Flag)
////Given:
////An array containing only 0, 1, and 2
////Example:
////Input:  [2,0,2,1,1,0]
////Output: [0,0,1,1,2,2]
////✔ Must sort in-place
////❌ Without using built-in sorting
////❌ Without counting array
////🧠 Hint (but we already know this)
////Three zones using three pointers:
////0 → low - 1  : all zeros
////low → mid - 1 : all ones
////mid → high : unknown region
////high + 1 → end : all twos
////Operations:
////Case	Action
////arr[mid] == 0	swap with low, low++, mid++
////arr[mid] == 1	mid++
////arr[mid] == 2	swap with high, high--
////Stop when:
////mid > high
////🧪 Test Cases
////Edge cases to verify your solution handles everything:
////[] (empty array)
////[0]
////[2]
////[1,1,1]
////[2,2,2,1,1,0,0]
////[0,2,1,0,2,1,2,0]
////📝 Output Format
////Print the sorted array using Arrays.toString(arr)
import java.util.Arrays;

public class p5 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0,2,1,2,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortColors(int[] arr){
        int left = 0;
        int mid =0;
        int right = arr.length-1;

        while (mid<=right){
            if (arr[mid] == 0){
                swap(arr, left,mid);
                left++;
                mid++;
            } else if (arr[mid] ==1) {
                mid++;
            } else {
                swap(arr, mid, right);
                right--;
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
