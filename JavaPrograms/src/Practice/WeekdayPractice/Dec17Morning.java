package Practice.WeekdayPractice;

import java.util.Arrays;

public class Dec17Morning {

    /// has duplicate
    static void main(String[] args) {
        String s = "pqdv";
        Dec17Morning dec = new Dec17Morning();
        System.out.println(dec.hasDuplicate(s));
    }
    boolean hasDuplicate(String s){
        int[] freq = new int[26];
        for (char c: s.toCharArray()){
            if (freq[c-'a']>0) return true;
            freq[c-'a']++;
        }
        return false;
    }
    /// Frequency Array
//    static void main(String[] args) {
//        String s = "asav";
//        int[] freq = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            int Index = s.charAt(i) - 'a';
//            freq[Index]++;
//        }
//        System.out.println(Arrays.toString(freq));
//    }

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
