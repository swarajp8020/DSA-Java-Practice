package Practice.Week8Practice;

public class Dec27Morning {
    /// Permutation in String
    static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        Solution solution = new Solution();
        System.out.println(solution.checkInclusion(s1,s2));
    }
    static class Solution{
        public boolean checkInclusion(String s1, String s2){
            if (s1.length() > s2.length()) return false;
            int[] freq1 = new int[26];
            int[] freq2 = new int[26];
            for (char c: s2.toCharArray()){
                freq1[c - 'a']++;
            }
            int k = s1.length();
            for (int i = 0; i < k; i++) {
                freq2[s2.charAt(i) - 'a']++;
            }
            if (matches(freq1, freq2)) return true;
            for (int right = k; right < s2.length(); right++) {
                freq2[s2.charAt(right) - 'a']++;
                freq2[s2.charAt(right - k) - 'a']--;
                if (matches(freq1, freq2)) return true;
            }
            return false;
        }
        private boolean matches(int[] a, int[] b){
            for (int i = 0; i < 26; i++) {
                if (a[i] != b[i]) return true;
            }
            return false;
        }
    }

    /// LongestSubstringWithoutRepeatingCharacters
//    static void main(String[] args) {
//        String s= "adadasf";
//        Solution solution = new Solution();
//        System.out.println(solution.longestSubString(s));
//    }
//    static class Solution{
//        public int longestSubString(String s){
//            int[] freq = new int[128];
//            int left = 0, maxLen = 0;
//            for (int right = 0; right < s.length(); right++) {
//                char c = s.charAt(right);
//                freq[c]++;
//                while (freq[c] > 1) {
//                    freq[s.charAt(left)]--;
//                    left++;
//                }
//                maxLen = Math.max(maxLen, right-left+1);
//            }
//            return maxLen;
//        }
//    }
}
