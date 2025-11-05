//3. Find the minimum and maximum using Linear Search
//
//Problem:
//Find the smallest and largest number in an array.
//
//Example:
//
//Input: arr = [12, 7, 19, 3, 15]
//Output: min = 3, max = 19
//
//
//🧠 Hint: Initialize min and max with arr[0] and update while looping.

package WeekdayPractice;

public class linearSearchMinMax {
    public static void main(String[] args) {
        int[] arr = {12, 7, 19, 3, 15};
        int min, max;
        int result = search(min, arr);
        int result1 = search1(max, arr);

    }
    static int search(int[] arr, int min){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min){
                System.out.println(min);
            }
        }
        return -1;
    }
    static int search1(int[] arr, int max){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max){
                System.out.println(max);
            }
        }
        return -1;
    }
}
