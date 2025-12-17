package Practice.WeekdayPractice;

import java.util.Arrays;

public class Dec17Morning {

    static class sol{
        public int longestSubstring(String s){
            int[] freq = new int[128];
            int left = 0, maxLen = 0;
            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                freq[c]++;
                if (freq[c]>1){
                    freq[s.charAt(left)]--;
                    left++;
                }
                maxLen= Math.max(maxLen,right-left+1);
            }
            return maxLen;
        }
    }
    //longestSubstring
    static void main(String[] args) {
        String s =  "sadasda";
        sol dec = new sol();
        System.out.println(dec.longestSubstring(s));
    }

    /// isPalindrome
//    static void main(String[] args) {
//        String s = "namaan";
//        Dec17Morning dc = new Dec17Morning();
//        System.out.println(dc.isPalindrome(s));
//    }
//    boolean isPalindrome(String s){
//        int left = 0, right = s.length()-1;
//        while (left < right) {
//            if (s.charAt(left)!=s.charAt(right))return false;
//            left++;
//            right--;
//        }
//        return true;
//    }

    /// has duplicate
//    static void main(String[] args) {
//        String s = "pqdv";
//        Dec17Morning dec = new Dec17Morning();
//        System.out.println(dec.hasDuplicate(s));
//    }
//    boolean hasDuplicate(String s){
//        int[] freq = new int[26];
//        for (char c: s.toCharArray()){
//            if (freq[c-'a']>0) return true;
//            freq[c-'a']++;
//        }
//        return false;
//    }
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
