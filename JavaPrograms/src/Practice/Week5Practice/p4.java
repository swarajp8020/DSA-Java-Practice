package Practice.Week5Practice;

public class p4 {
/// Pattern 2 — First/Last Occurrence
//    arr = [2,5,7,9,12], target=9 → output = 3
public static void main(String[] args) {
    int[] arr = {2,5,7,9,12};
    int target= 9;
    System.out.println(search(arr, target));
    System.out.println(first(arr, target));
    System.out.println(last(arr, target));
}
    static int first(int[] arr, int target){
        int left =0,right=arr.length-1, ans =-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (arr[mid]==target) {
                ans = mid;
                right = mid-1;
            }
            if (arr[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return ans;
    }
    static int last(int[] arr, int target){
        int left =0,right=arr.length-1, ans=-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (arr[mid]==target) {
             ans = mid;
             left = mid+1;
            }
            if (arr[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }

static int search(int[] arr, int target){
    int left =0,right=arr.length-1;
    while (left<=right){
        int mid = left+(right-left)/2;
        if (arr[mid]==target) return mid;
        if (arr[mid]<target) left = mid+1;
        else right = mid-1;
    }
    return -1;
}

    /// pattern-1 Binary Search
    /// arr = [2,5,7,9,12], target=9 → output = 3
//    public static void main(String[] args) {
//        int[] arr = {2,5,7,9,12};
//        int target = 9;
//        System.out.println(search(arr,target));
//    }
//    static int search(int[] arr, int target){
//        int left=0, right =arr.length-1;
//        while (left<=right){
//            int mid = left+(right-left)/2;
//            if (arr[mid]==target)return mid;
//            if (arr[mid]<target)left=mid+1;
//            else right=mid-1;
//        }
//        return -1;
//    }
}
