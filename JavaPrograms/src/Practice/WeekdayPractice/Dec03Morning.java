package Practice.WeekdayPractice;

public class Dec03Morning {

/// 875. Koko Eating Bananas
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        System.out.println(eatingBananas(piles, h));
    }
    static int eatingBananas(int[] piles, int h){
        int low = 1;
        int high = max(piles);
        int ans = high;
        while (low<=high){
            int speed = low +(high-low)/2;
            if (canEat(piles, h, speed)){
                ans = speed;
                high = speed-1;
            }else low = speed+1;
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
    static int max(int[]arr){
        int m = 0;
        for (int x:arr)m=Math.max(m,x);
        return m;
    }

    /// 1011. Capacity To Ship Packages Within D Days
//    public static void main(String[] args) {
//        int[] weights = {1,2,3,4,5,6,7,8,9,10};
//        int days = 5;
//        System.out.println(shipCapacity(weights, days));
//    }
//    static int shipCapacity(int[] weights, int days){
//        int low = max(weights);
//        int high = sum(weights);
//        int ans  = high;
//        while (low<=high){
//            int mid = low+(high-low)/2;
//            if (canShip(weights,days,mid)){
//                ans = mid;
//                high = mid-1;
//            } else low = mid+1;
//        }
//        return ans;
//    }
//    static boolean canShip(int[]weights, int days, int can){
//        int d = 1, load = 0;
//        for (int a: weights){
//            if (load+a>can){
//                d++;
//                load = a;
//            } else load +=a;
//        }
//        return days >= d;
//    }
//    static int max(int[] arr){
//        int m = 0;
//        for (int x: arr) m=Math.max(m,x);
//        return m;
//    }
//    static int sum(int[] arr){
//        int s = 0;
//        for (int x:arr)s+=x;
//        return s;
//    }
}
