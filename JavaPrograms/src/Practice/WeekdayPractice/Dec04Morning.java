package Practice.WeekdayPractice;

public class Dec04Morning {
/// 1011. Capacity To Ship Packages Within D Days
    public static void main(String[] args) {
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(capacityShip(weights, days));
    }
    static int capacityShip(int[] weights, int days){
        int low = max(weights);
        int high = sum(weights);
        int ans = high;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (canShip(weights,days,mid)){
                ans = mid;
                high = mid-1;
            } else low = mid+1;
        }
        return ans;
    }
    static boolean canShip(int[] weights, int days, int limit){
        int d =1, load =0;
        for (int x:weights){
            if (load+x>limit){
                d++;
                load = x;
            } else load += x;
        }
      return days >= d;
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
}
