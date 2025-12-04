package Practice.WeekdayPractice;

public class Dec04Morning {
/// 410. Split Array Largest Sum
public static void main(String[] args) {
    int[] nums = {7,2,5,10,8};
    int k = 2;
    System.out.println(splitArray(nums, k));
}
static int splitArray(int[] nums, int k){
    int low = max(nums);
    int high = sum(nums);
    int ans = high;
    while (low<=high){
        int mid = low + (high-low)/2;
        if (canSplit(nums, k, mid)){
            ans = mid;
            high = mid-1;
        } else low = mid+1;
    }
    return ans;
}
    static boolean canSplit(int[] nums, int k, int limit){
    int groupCount = 1, currentSum = 0;
    for (int x: nums){
        if (currentSum+x>limit){
            groupCount++;
            currentSum = x;
            if (groupCount>k) return false;
        } else currentSum += x;
    }
    return k >= groupCount;
    }
    static int max(int[] arr){
        int m = 0;
        for (int x: arr)m=Math.max(m,x);
        return m;
    }
    static int sum(int[] sum){
        int s = 0;
        for (int x:sum)s+=x;
        return s;
    }

    /// 875. Koko Eating Bananas
//    public static void main(String[] args) {
//        int[] piles = {30,11,23,4,20};
//        int h = 6;
//        System.out.println(eatingBananas(piles,h));
//    }
//    static int eatingBananas(int[] piles, int h){
//         int low = 0;
//         int high = max(piles);
//         int ans = high;
//         while (low<=high){
//             int speed = low+(high - low)/2;
//             if (canEat(piles, h, speed)){
//                 ans = speed;
//                 high = speed-1;;
//             } else low = speed+1;
//         }
//         return ans;
//    }
//    static boolean canEat(int[] piles, int h, int speed){
//        int hoursUsed = 0;
//        for (int x: piles){
//            hoursUsed += (x+speed-1)/speed; //Peeked here once
//            if (hoursUsed > h) return false;
//        }
//        return true;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x:arr)m=Math.max(m, x);
//        return m;
//    }

/// 1011. Capacity To Ship Packages Within D Days
//    public static void main(String[] args) {
//        int[] weights = {1,2,3,1,1};
//        int days = 4;
//        System.out.println(capacityShip(weights, days));
//    }
//    static int capacityShip(int[] weights, int days){
//        int low = max(weights);
//        int high = sum(weights);
//        int ans = high;
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (canShip(weights,days,mid)){
//                ans = mid;
//                high = mid-1;
//            } else low = mid+1;
//        }
//        return ans;
//    }
//    static boolean canShip(int[] weights, int days, int limit){
//        int d =1, load =0;
//        for (int x:weights){
//            if (load+x>limit){
//                d++;
//                load = x;
//            } else load += x;
//        }
//      return days >= d;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr)m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] sum){
//        int s = 0;
//        for (int x:sum)s+=x;
//        return s;
//    }
}
