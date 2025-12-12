package Practice.WeekdayPractice;

public class Dec12 {
    /// 4. Median of Two Sorted Arrays
    static void main() {
        int[] A = {1,3};
        int[] B = {2};
        System.out.println(findMedianSorted(A,B));
    }
    static double findMedianSorted(int[]A,int[]B){
        int n = A.length;
        int m = B.length;
        int low = 0, high = n;
        while (low <= high) {
            int cutA = (high+low)/2;
            int cutB = (n+m+1)/2-cutA;
            int Aleft = (cutA == 0) ? Integer.MIN_VALUE : A[cutA-1];
            int Aright = (cutA == n) ? Integer.MAX_VALUE : A[cutA];
            int Bleft = (cutB == 0) ? Integer.MIN_VALUE : B[cutB-1];
            int Bright = (cutB == m) ? Integer.MAX_VALUE : B[cutB];
            if (Aleft <= Bright && Bleft <= Aright) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(Aleft,Bleft)+Math.max(Aright,Bright))/2.0;
                }
                return Math.max(Aleft,Bleft);
            } else if (Aleft > Bright) {
                high = cutA-1;
            } else low = cutA+1;
        }
        return 0;
    }
}
