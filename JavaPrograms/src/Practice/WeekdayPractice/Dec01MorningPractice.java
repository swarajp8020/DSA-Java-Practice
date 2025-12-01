package Practice.WeekdayPractice;

public class Dec01MorningPractice {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int H = 6;
        System.out.println(minEatingSpeed(piles,H));
    }
    static int minEatingSpeed(int[] piles, int H){
        int low = 1;
        int high = max(piles);
        int ans = high;
        while (low<=high){
            int speed = low+(high-low)/2;
            if (canEat(piles,H,speed)){
                ans=speed;
                high=speed-1;
            }else low=speed+1;
        }
        return ans;
    }
    static boolean canEat(int[] piles, int H, int speed){
        int hoursUsed = 0;
        for (int pile:piles){
            hoursUsed+=(pile+speed-1)/speed;
            if (hoursUsed>H)return false;
        }
        return true;
    }

    static int max(int[]arr){
        int m = 0;
        for (int x:arr)m=Math.max(m,x);
        return m;
    }
}
