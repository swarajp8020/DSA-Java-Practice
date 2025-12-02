package Practice.WeekdayPractice;

public class BSMedianModel {
    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {3};
        System.out.println(findMedianSortedArrays(A,B));
    }
    static double findMedianSortedArrays(int[] A, int[] B){
        if (A.length>B.length)return findMedianSortedArrays(B,A);
        int n = A.length;
        int m = B.length;
        int low = 0, high = n;
        while (low<=high){
            int cutA = (high+low)/2;
            int cutB = (n+m+1)/2-cutA;

            int Aleft = (cutA==0)?Integer.MIN_VALUE:A[cutA-1];
            int Bright = (cutA==n)?Integer.MAX_VALUE:A[cutA];

            int Bleft = (cutB==0)?Integer.MIN_VALUE:B[cutB-1];
            int Aright = (cutB==m)?Integer.MAX_VALUE:B[cutB];

            if (Aleft <= Bright && Bleft <= Aright){
                if ((n+m)%2==0){
                    return Math.max(Aleft, Bright)+Math.min(Bleft,Aright);
                }
                return Math.max(Aleft,Bleft);
            } else if (Aleft>Bleft) {
                high = cutA -1;
            } else {
                low = cutA +1;
            }
        }

        return 0;
    }
}
