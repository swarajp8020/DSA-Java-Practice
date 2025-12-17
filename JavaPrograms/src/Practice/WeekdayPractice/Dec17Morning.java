package Practice.WeekdayPractice;

import java.util.Arrays;

public class Dec17Morning {

    /// Frequency Array
    static void main(String[] args) {
        String s = "asav";
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int Index = s.charAt(i) - 'a';
            freq[Index]++;
        }
        System.out.println(Arrays.toString(freq));
    }

    /// reverse String
//    static void main(String[] args) {
//        String s = "swaraj";
//        StringBuilder sb = new StringBuilder(s);
//        int left = 0, right = sb.length()-1;
//        while (left < right) {
//            char temp = sb.charAt(left);
//            sb.setCharAt(left, sb.charAt(right));
//            sb.setCharAt(right, temp);
////            left++;
//            right--;
//            left++;
//        }
//        System.out.println(sb.toString());
//    }
}
