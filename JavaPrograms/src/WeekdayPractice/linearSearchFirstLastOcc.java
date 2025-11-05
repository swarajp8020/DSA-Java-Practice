package WeekdayPractice;
//Find the first and last occurrence of a number
//
//Problem:
//In a given array, find the first and last index of a target number.
//
//Example:
//
//Input: arr = [5, 7, 7, 8, 8, 10], target = 8
//Output: first = 3, last = 4
//
//
//🧠 Hint: Keep two variables first = -1, last = -1 and update them as you loop.
public class linearSearchFirstLastOcc {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int result = search(arr, target);
        if (target == -1){
            System.out.println("-1");
        } else {
            System.out.println(result);
        }

    }
    static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
