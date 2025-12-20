package recapImpTopics.string;
/// Explaination
/// NOW THE CORE LOGIC (ELI5 FIRST)
/// What this problem is REALLY asking
/// “What’s the longest window where I can make all characters same
/// by changing at most k characters?”
/// Inside any window:
/// One character is the boss (most frequent)
/// All others must be changed
/// So:
/// characters_to_change = window_size - frequency_of_most_common_char
/// If that number ≤ k, the window is valid.
/// That’s it. That’s the entire idea.
/// NOW YOUR QUESTIONS — ANSWERED CLEANLY
/// ❓ maxFreq = Math.max(maxFreq, freq[c-'a']);
/// Your thought:
/// “we're checking frequency of character I guess”
/// Yes — but specifically:
/// 👉 maxFreq = count of the most frequent character in the current window
/// This represents:
/// The character we keep
/// Everything else gets replaced
/// Example:
/// Window = "AABAB"
/// freq = {A:3, B:2}
/// maxFreq = 3
/// ❓ int charsToChange = windowSize - maxFreq; // not sure
/// This is the key line.
/// Let’s ELI5 this:
/// If your window is:
/// "AABAB"  (size = 5)
/// Most frequent character:
/// 'A' occurs 3 times
/// To make all characters the same:
/// Keep A
/// Change the other 2
/// So:
/// charsToChange = 5 - 3 = 2
/// That’s exactly what this line means.
/// 👉 Number of characters that must be replaced
/// ❓ if (charsToChange > k) — ELI5
/// If you are allowed to change at most k characters:
/// charsToChange <= k → window is valid ✅
/// charsToChange > k → window is invalid ❌
/// When invalid:
/// 👉 shrink the window from the left
/// because we’re using a sliding window with constraint
/// THE MOST IMPORTANT CONFUSION (EVERYONE HAS THIS)
/// ❓ Why don’t we decrease maxFreq when shrinking?
/// This feels wrong at first. Here’s why it still works.
/// Key truth:
/// maxFreq is allowed to be slightly stale
/// Why?
/// Window size is always calculated correctly
/// Even if maxFreq is overestimated:
/// (windowSize - maxFreq) becomes smaller
/// That only delays shrinking
/// It NEVER allows an invalid window to be counted as valid
/// So correctness is preserved.
/// Interview one-liner:
/// “We don’t decrease maxFreq because it doesn’t affect correctness.
/// It may delay shrinking but never causes an invalid window to be accepted.”
/// That’s a strong answer.
public class longestCharacterReplacement {
    static class Sol{
        public int characterReplacement(String s, int k){
            int[] freq = new int[26];
            int left = 0, maxLen = 0, maxFreq = 0;
            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                freq[c-'A']++;
                maxFreq = Math.max(maxFreq, freq[c-'A']);
                int windowSize = right - left + 1;
                int charsToChange = windowSize - maxFreq;
                if (charsToChange > k) {
                    freq[s.charAt(left) - 'A']--;
                    left++;
                }
                maxLen = Math.max(maxLen, right-left+1);
            }
            return maxLen;
        }
    }
    static void main(String[] args) {
        String s = "ASADA";
        int k = 2;
        Sol so = new Sol();
        System.out.println(so.characterReplacement(s,k));
    }
}
