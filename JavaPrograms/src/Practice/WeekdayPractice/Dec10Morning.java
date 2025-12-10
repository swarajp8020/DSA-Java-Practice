package Practice.WeekdayPractice;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class TimeMap4{
    static HashMap<String, List<Pair4>> map;
    static class Pair4{
        int time;
        String value;
        Pair4(int t, String v){
            time = t;
            value =v;
        }
    }
    public TimeMap4(){
        map = new HashMap<>();
    }
    static void set(String key, String value, int timestamp){
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair4(timestamp,value));
    }
    static String get(String key, int timestamp){
        if (!map.containsKey(key))return "";
        List<Pair4> list = map.get(key);
        int low = 0, high = list.size()-1;
        String answer = "";
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (list.get(mid).time<=timestamp){
                answer = list.get(mid).value;
                low = mid+1;
            } else high = mid-1;
        }
        return answer;
    }
}

public class Dec10Morning {
    /// 981. Time Based Key-Value Store
    static void main() {
        TimeMap4 map = new TimeMap4();
        map.set("soo","siuu",4);
        System.out.println(map.get("soo",4));
    }

    /// 4. Median of Two Sorted Arrays
//    static void main() {
//        int[] A = {1,2};
//        int[] B = {3,4};
//        System.out.println(findMedianSortedArrays(A,B));
//    }
//    static double findMedianSortedArrays(int[]A, int[]B){
//        int n = A.length;
//        int m = B.length;
//        int low= 0, high =n;
//        while (low <= high) {
//            int cutA = (low+high)/2;
//            int cutB = (n+m+1)/2-cutA;
//            int Aleft = (cutA == 0) ? Integer.MIN_VALUE : A[cutA-1];
//            int Aright = (cutA == n) ? Integer.MAX_VALUE : A[cutA];
//            int Bleft = (cutB == 0) ? Integer.MIN_VALUE : B[cutB-1];
//            int Bright = (cutB == m) ? Integer.MAX_VALUE : B[cutB];
//            if (Aleft <= Bright && Bleft <= Aright) {
//                if ((n + m) % 2 == 0) {
//                    return (Math.max(Aleft,Bleft)+Math.min(Aright,Bright))/2.0;
//                }
//                return Math.max(Aleft,Bleft);
//            } else if (Aleft>Bright){
//                high = cutA-1;
//            } else low = cutA +1;
//        }
//        return 0;
//    }
    /// 410. Split Array Largest Sum
//    static void main() {
//        int[] nums = {1,2,3,4,5};
//        int k =2;
//        System.out.println(splitArray(nums,k));
//    }
//    static int splitArray(int[] nums,int k){
//        int low = max(nums);
//        int high = sum(nums);
//        int ans = high;
//        while (low <= high) {
//            int mid = low+(high-low)/2;
//            if (canSplit(nums,k,mid)){
//                ans = mid;
//                high = mid-1;
//            } else low = mid+1;
//        }
//        return ans;
//    }
//    static boolean canSplit(int[] nums, int k, int limit){
//        int groupCount = 1, currentSum = 0;
//        for (int x:nums){
//            if (currentSum+x>limit){
//                groupCount++;
//                currentSum = x;
//                if (groupCount>k) return false;
//            }else currentSum += x;
//        }
//        return k>=groupCount;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s = 0;
//        for (int x: arr)s+=x;
//        return s;
//    }

    /// 875. Koko Eating Bananas
//    static void main() {
//        int[] piles = {30,11,23,4,20};
//        int h = 6;
//        System.out.println(minEatingSpeed(piles,h));
//    }
//    static int minEatingSpeed(int[] piles, int h){
//        int low = 0;
//        int high = max(piles);
//        int ans = high;
//        while (low<=high){
//            int speed = low+(high-low)/2;
//            if (canEat(piles,h,speed)){
//                ans = speed;
//                high = speed-1;
//            } else low = speed+1;
//        }
//        return ans;
//    }
//    static boolean canEat(int[] piles, int h, int speed){
//        int hoursUsed = 0;
//        for (int pile:piles){
//            hoursUsed += (pile+speed-1)/speed;
//            if (hoursUsed>h)return false;
//        }
//        return true;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
    /// 1011. Capacity To Ship Packages Within D Days
//    static void main() {
//        int[] weights = {1,2,3,1,1};
//        int days = 4;
//        System.out.println(capacityShip(weights,days));
//    }
//    static int capacityShip(int[] weights, int days){
//        int low = max(weights);
//        int high = sum(weights);
//        int ans = high;
//        while (low<=high){
//            int mid = low+(high-low);
//            if (canShip(weights,days,mid)){
//                ans = mid;
//                high = mid-1;
//            } else low = mid+1;
//        }
//        return ans;
//    }
//    static boolean canShip(int[] weights, int days, int cap){
//        int d=1, load=0;
//        for (int x: weights){
//            if (load+x>cap){
//                d++;
//                load=x;
//            }else load+=x;
//        }
//        return days >= d;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s = 0;
//        for (int x: arr)s+=x;
//        return s;
//    }
}
