package Practice.WeekdayPractice;

public class Dec03Morning {


    // 1011. Capacity To Ship Packages Within D Days
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipCapacity(weights, days));
    }
    static int shipCapacity(int[] weights, int days){
        int low = max(weights);
        int high = sum(weights);
        int ans  = high;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (canShip(weights,days,mid)){
                ans = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return ans;
    }
    static boolean canShip(int[]weights, int days, int can){
        int d = 1, load = 0;
        for (int a: weights){
            if (load+a>can){
                d++;
                load = a;
            } else load +=a;
        }
        return days >= d;
    }
    static int max(int[] arr){
        int m = 0;
        for (int x: arr) m=Math.max(m,x);
        return m;
    }
    static int sum(int[] arr){
        int s = 0;
        for (int x:arr)s+=x;
        return s;
    }
}
