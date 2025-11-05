package WeekdayPractice;

//2. Count occurrences of an element
//
//Problem:
//Given an array, count how many times a number appears.
//
//Example:
//
//Input: arr = [2, 3, 5, 3, 7, 3, 9], target = 3
//Output: 3
//
//
//🧠 Hint: Don’t break when you find the element — keep looping and count.
public class linearSearch2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 3, 7, 3, 9};
        int target = 3;
        int result = search(arr, target);
        if (target == -1){
            System.out.println("-1");
        } else {
            System.out.println("Count "+ result);
        }
    }
    static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}
