package Practice.Week9Practice;

public class Dec29 {
    /// LongestPalindromeSubstring
    static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
    static String longestPalindrome(String s){
        if (s == null || s.length() < 2)return s;
        int start = 0, maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i +1);
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }
    static int expand(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
