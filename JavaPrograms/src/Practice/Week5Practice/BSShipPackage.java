package Practice.Week5Practice;

public class BSShipPackage {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int D=5;
        System.out.println(shipWithinDays(arr, D));
    }
    static int shipWithinDays(int[] arr,int D){
        int low = max(arr) ; // biggest weight
        int high = sum(arr) ; // sum of weights
        int ans = high;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(canShip(arr, D, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    static int max(int[] arr){
        int m = arr[0];
        for(int x:arr) m = Math.max(m,x);
        return m;
    }

    static int sum(int[] arr){
        int s = 0;
        for(int x:arr) s += x;
        return s;
    }
    static boolean canShip(int[] arr,int D,int cap){
        int days = 1 , load = 0;

        for(int w:arr){
            if(load + w > cap){
                days++;
                load = w;
            }else load += w;
        }
        return days <= D;
    }
}
