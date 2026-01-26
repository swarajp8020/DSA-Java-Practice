package Practice.Week13Practice;


public class Jan26Morning {
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxLen = 0, maxFreq = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq[c - 'a']++;
            maxFreq = Math.max(maxFreq, freq[c - 'a']);
            int windowSize = right - left + 1;
            int charsToChange = windowSize - maxFreq;
            if (charsToChange > k) {
                freq[s.charAt(left)-'a']--;
                left++;
            } maxLen = Math.max(maxFreq, right-left+1);
        } return maxLen;
    }
    static void main(String[] args) {
        String s = "sada";
        int k = 2;
        System.out.println(characterReplacement(s,k));
    }
}
