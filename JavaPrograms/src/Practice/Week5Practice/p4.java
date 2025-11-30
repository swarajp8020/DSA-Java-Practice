package Practice.Week5Practice;

public class p4 {
    /// Rotate Array
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchRotated(arr,target));
    }
    static int searchRotated(int[] arr, int target){
        int left=0,right = arr.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (arr[mid]==target)return mid;
            if (arr[left]<=arr[mid]){
                if (arr[left]<=target && target<=arr[mid])right=mid-1;
                else left=mid+1;
            }
            else {
                if (arr[mid]<=target && target<=arr[right])left=mid+1;
                else right = mid-1;
            }
        }
        return -1;
    }

/// Pattern 2 — First/Last Occurrence
//    first([1,2,2,2,3],2)
//public static void main(String[] args) {
//    int[] arr = {1,2,2,2,3};
//    int target= 2;
//    System.out.println(first(arr, target));
//}
//    static int first(int[] arr, int target){
//        int left =0,right=arr.length-1, ans =-1;
//        while (left<=right){
//            int mid = left+(right-left)/2;
//            if (arr[mid]==target) {
//                ans = mid;
//                right = mid-1;
//            }
//            if (arr[mid]<target) left = mid+1;
//            else right = mid-1;
//        }
//        return ans;
//    }
//    static int last(int[] arr, int target){
//        int left =0,right=arr.length-1, ans=-1;
//        while (left<=right){
//            int mid = left+(right-left)/2;
//            if (arr[mid]==target) {
//             ans = mid;
//             left = mid+1;
//            }
//            else if (arr[mid]<target) left = mid+1;
//            else right = mid-1;
//        }
//        return -1;
//    }
//public static void main(String[] args) {
////    int[] arr = {1,2,2,2,3};
////    int target= 2;
////    System.out.println(last(arr, target));
////}
//static int search(int[] arr, int target){
//    int left =0,right=arr.length-1;
//    while (left<=right){
//        int mid = left+(right-left)/2;
//        if (arr[mid]==target) return mid;
//        else if (arr[mid]<target) left = mid+1;
//        else right = mid-1;
//    }
//    return -1;
//}

    /// pattern-1 Binary Search
    /// arr = [2,5,7,9,12], target=9 → output = 3
//    public static void main(String[] args) {
//        int[] arr = {2,4,6,8,10};
//        int target = 6;
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
