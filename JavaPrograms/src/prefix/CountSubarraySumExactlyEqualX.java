package prefix;

public class CountSubarraySumExactlyEqualX {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,1,3};
        int x = 5;
        System.out.println(countSubarraySumX(arr,x));
    }
    static int countSubarraySumX(int[] arr, int x){
        int count = 0;
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum==x){
                    count++;
                }
            }
        }
        return count;
    }
}
