package Practice.Week8Practice;

public class Dec27Morning {
    /// LongestSubstringWithoutRepeatingCharacters
    static void main(String[] args) {
        String s= "adadasf";
        Solution solution = new Solution();
        System.out.println(solution.longestSubString(s));
    }
    static class Solution{
        public int longestSubString(String s){
            int[] freq = new int[128];
            int left = 0, maxLen = 0;
            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                freq[c]++;
                while (freq[c] > 1) {
                    freq[s.charAt(left)]--;
                    left++;
                }
                maxLen = Math.max(maxLen, right-left+1);
            }
            return maxLen;
        }
    }
}
