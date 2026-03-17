package Practice.Week20Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/// Word Break
public class March17Morning {
    public static boolean wordBreak(String inputString, List<String> wordDictionary) {

        Set<String> wordSet = new HashSet<>(wordDictionary);

        boolean[] dp = new boolean[inputString.length() + 1];

        dp[0] = true; // empty string

        for (int endIndex = 1; endIndex <= inputString.length(); endIndex++) {

            for (int startIndex = 0; startIndex < endIndex; startIndex++) {

                String currentSubstring = inputString.substring(startIndex, endIndex);

                if (dp[startIndex] && wordSet.contains(currentSubstring)) {
                    dp[endIndex] = true;
                    break;
                }
            }
        }

        return dp[inputString.length()];
    }

    public static void main(String[] args) {

        String inputString = "leetcode";
        List<String> wordDictionary = Arrays.asList("leet", "code");

        boolean result = wordBreak(inputString, wordDictionary);

        System.out.println(result); // true
    }
}
