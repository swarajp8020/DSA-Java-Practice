package Practice.Week5Practice;

import java.util.HashMap;

/// PHASE-C → Prefix Sum + Hashmap
/// Task	Input	Expected
/// 9. Count subarrays sum = X	arr=[4,1,2,1,1,3],X=5	3
/// 10. Count subarrays sum = 0	arr=[1,-1,2,-2,3]	3
/// 11. Count subarrays divisible by K	arr=[2,4,3,9],k=3	4
/// 12. Count subarrays divisible by K	arr=[5,3,2,7,1,4],k=5	3
public class p3 {
//    9. Count subarrays sum = X
//public static void main(String[] args) {
//    int[] arr = {4,1,2,1,1,3};
//    int x = 5;
//    System.out.println(countSubarraysSumX(arr,x));
//    }
//    static int countSubarraysSumX(int[] arr, int x){
//    int prefix = 0;
//    int count = 0;
//        HashMap<Integer, Integer>map = new HashMap<>();
//        map.put(0,1);
//        for (int i = 0; i < arr.length; i++) {
//            prefix += arr[i];
//            if (map.containsKey(prefix-x)){
//                count+= map.get(prefix-x);
//            }
//            map.put(prefix,map.getOrDefault(prefix,0)+1);
//        }
//        return count;
//    }

//    10. Count subarrays sum = 0	arr=[1,-1,2,-2,3]	3
//public static void main(String[] args) {
//    int[] arr = {1,-1,2,-2,3};
//    System.out.println(countSubarraysSumX(arr));
//}
//    static int countSubarraysSumX(int[] arr){
//        int prefix = 0;
//        int count = 0;
//        HashMap<Integer, Integer>map = new HashMap<>();
//        map.put(0,1);
//        for (int num : arr){
//            prefix += num;
//            if (map.containsKey(prefix)){
//                count+=map.get(prefix);
//            }
//            map.put(prefix, map.getOrDefault(prefix,0)+1);
//        }
//        return count;
//    }

///  Count subarrays divisible by K	arr=[2,4,3,9],k=3
    public static void main(String[] args) {
        int[] arr = {5,3,2,7,1,4};
        int k = 3;
        System.out.println(countSubarraysSumX(arr,k));
    }
    static int countSubarraysSumX(int[] arr, int k){
        int prefix = 0;
        int count = 0;
        HashMap<Integer, Integer>map = new HashMap<>();
        map.put(0,1);

       for (int num:arr){
           prefix+=num;

           int res = prefix%k;
           if (res<0)res+= k;

           if (map.containsKey(res)){
               count+=map.get(res);
           }
           map.put(res, map.getOrDefault(res,0)+1);
       }

        return count;
    }
}
