package Practice.WeekdayPractice;

public class BSSplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {3,6,7,11};
        int k =1;
        System.out.println(splitArray(nums, k));
    }
    static int splitArray(int[] nums, int k){
        int low=max(nums);
        int high=sum(nums);
        int ans=high;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (canSplit(nums,k,mid)){
                ans=mid;
                high=mid-1;
            } else low=mid+1;
        }
        return ans;
    }
    static boolean canSplit(int[] arr, int k, int limit){
        int groupCount =1, currentSum=0;
        for (int num:arr){
            if (currentSum+num>limit){
                groupCount++;
                currentSum=num;

            if (groupCount>k) return false;
            }else currentSum+=num;
        }
        return true;
    }

    static int max(int[]arr){
        int m = 0;
        for (int x:arr)m=Math.max(m,x);
        return m;
    }
    static int sum(int[] arr){
        int s = 0;
        for (int x:arr)s+=x;
        return s;
    }
}
