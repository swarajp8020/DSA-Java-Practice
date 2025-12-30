package Practice.Week9Practice;

import java.util.Arrays;

public class Dec30Morning {
    /// ReverseString
    static void main(String[] args) {
        String s = "hello";
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = sb.length() - 1;
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println(sb.toString());
    }

    /// FrequencyArray
//    static void main(String[] args) {
//        String s = "abc";
//        int[] freq = new int[26];
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            freq[c - 'a']++;
//        }
//        System.out.println(Arrays.toString(freq));
//    }

    /// palindromicSubstrings
//    static void main(String[] args) {
//        String s = "abc";
//        System.out.println(countSubstrings(s));
//    }
//    static int countSubstrings(String s){
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            count += expand(s, i, i);
//            count += expand(s, i, i + 1);
//        }
//        return count;
//    }
//    static int expand(String s, int left, int right){
//        int count = 0;
//        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
//            count++;
//            left--;
//            right++;
//        }
//        return count;
//    }
}
