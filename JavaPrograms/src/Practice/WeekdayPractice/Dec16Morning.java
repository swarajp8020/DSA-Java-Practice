package Practice.WeekdayPractice;

import string.hasDuplicate;

import java.lang.reflect.Array;
import java.util.Arrays;


class Solution3 {
    public int lengthOfLongestSubstring(String s){
        int[] freq = new int[128];
        int left = 0, maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c]++;
            while (freq[c] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left+1);
        }
        return maxLen;
    }
}
public class Dec16Morning {

    /// LengthOfLongestSubString
    static void main(String[] args) {
        String s = "abababa";
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.lengthOfLongestSubstring(s));
    }
    /// IsPalindrome
//    static void main(String[] args) {
//        String s = "namasn";
//        Dec16Morning i = new Dec16Morning();
//        System.out.println(i.isPalindrome(s));
//    }
//    boolean isPalindrome(String s){
//        int left = 0, right = s.length()-1;
//        while (left < right) {
//            if (s.charAt(left)!= s.charAt(right))return false;
//            left++;
//            right--;
//        }
//        return true;
//    }

    /// Has Duplicates
//    static void main(String[] args) {
//        String s = "swaraj";
//        Dec16Morning h = new Dec16Morning();
//        System.out.println(h.hasDuplicates(s));
//    }
//    boolean hasDuplicates(String s){
//        int[] freq = new int[26];
//        for (char c : s.toCharArray()){
//            if (freq[c-'a']>0)return true;
//        }
//        return false;
//    }

    /// Frequency Map
//    static void main(String[] args) {
//        String s = "leetcode";
//        int[] freq = new int[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            int index = s.charAt(i) - 'a';
//            freq[index]++;
//        }
//        System.out.println(Arrays.toString(freq));
//    }

    /// String Reverse
//    static void main() {
//        String s = "Swaraj";
//        StringBuilder stringBuilder = new StringBuilder(s);
//        int left = 0, right = stringBuilder.length()-1;
//        while (left < right) {
//            char temp = stringBuilder.charAt(left);
//            stringBuilder.setCharAt(left, stringBuilder.charAt(right));
//            stringBuilder.setCharAt(right,temp);
//            left++;
//            right--;
//        }
//        System.out.println(stringBuilder.toString());
//    }
}
