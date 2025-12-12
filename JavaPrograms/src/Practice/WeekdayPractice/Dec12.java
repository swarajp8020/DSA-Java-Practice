package Practice.WeekdayPractice;

public class Dec12 {
    /// 875. Koko Eating Bananas
    static void main() {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println(eatingBananas(piles,h));
    }
    static int eatingBananas(int[] piles, int h){
        int low = 0;
        int high = max(piles);
        int ans = high;
        while (low <= high) {
            int speed=low+(high-low)/2;
            if (canEat(piles,h,speed)){
                ans = speed;
                high = speed-1;
            } else low = speed+1;
        }
        return ans;
    }
    static boolean canEat(int[] piles, int h, int speed){
        int hoursUsed = 0;
        for (int pile:piles){
            hoursUsed += (pile+speed-1)/speed;
            if (hoursUsed>h)return false;
        }
        return true;
    }
    static int max(int[] arr){
        int m = 0;
        for (int x: arr)m = Math.max(m,x);
        return m;
    }
    /// 1011. Capacity To Ship Packages Within D Days
//    static void main() {
//        int[] weights = {1,2,3,1,1};
//        int days = 4;
//        System.out.println(findShipWithinDays(weights,days));
//    }
//    static int findShipWithinDays(int[] weights, int days){
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
//    static boolean canShip(int[] weights, int days, int can){
//        int d=1, load=0;
//        for (int x:weights){
//            if (load + x > can) {
//                d++;
//                load=x;
//            }else load+=x;
//        }
//        return days >= d;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr)m = Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s = 0;
//        for (int x:arr)s+=x;
//        return s;
//    }
    /// 4. Median of Two Sorted Arrays
//    static void main() {
//        int[] A = {1,2};
//        int[] B = {3,4};
//        System.out.println(findMedianSorted(A,B));
//    }
//    static double findMedianSorted(int[]A,int[]B){
//        int n = A.length;
//        int m = B.length;
//        int low = 0, high = n;
//        while (low <= high) {
//            int cutA = (high+low)/2;
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
//            } else if (Aleft > Bright) {
//                high = cutA-1;
//            } else low = cutA+1;
//        }
//        return 0;
//    }
}
