package recapImpTopics.string;
/// Explaination
//We want the **longest continuous part of the string** where **no character appears more than once**.
//Example
//`s = "sadadaf"`
//Valid windows:
//* `"sa"` ✅
//* `"sad"` ✅
//* `"sada"` ❌ (a repeats)
//* `"daf"` ✅
//Answer = `3`
//## WHY SLIDING WINDOW IS THE RIGHT TOOL
//Here’s the key observation:
//* We need a **substring** (continuous)
//* We need a **constraint** (no repeating characters)
//* We want the **longest**
//This screams:
//👉 **Variable-size sliding window**
//We expand to grow the answer
//We shrink only when the constraint breaks
//## NOW LET’S ATTACK YOUR QUESTIONS ONE BY ONE
//### ❓ `int[] freq = new int[128];`
//Your thought:
//> 128 is ASCII value where all a-z, A-Z, 1-n are in there so feasible I guess
//✅ Correct. Let me make it precise.
//
//* Java `char` is basically a number
//* ASCII characters range from `0–127`
//* When you write `freq[c]`, Java converts `c` to its ASCII number
//Example:
//
//```java
//char c = 'a';
//int index = c; // index = 97
//freq[97]++;
//```
//So `freq[c]` means:
//👉 “How many times has character `c` appeared in the current window?”
//
//That’s it. Nothing magical.
//### ❓ `char c = s.charAt(right); // not sure how this is handling`
//
//What’s happening internally:
//
//* `s.charAt(right)` returns a **character**
//* That character is stored in variable `c`
//* Example when `right = 2`:
//
//```java
//s = "sadadaf"
//c = 'd'
//```
//
//Now `c` is just a `char`, but Java can treat it like an `int` when needed.
//
//---
//
//### ❓ `freq[c]++; // are we storing index of right?`
//
//This is an important misunderstanding. Let’s fix it.
//
//❌ We are NOT storing the index
//❌ We are NOT storing position
//
//✅ We are storing **count**
//
//Think like this:
//
//* `freq` is a **ledger**
//* Index = character
//* Value = how many times it appears in the window
//
//Example walkthrough:
//
//`s = "sadadaf"`
//
//At some point window = `"ada"`
//
//* `freq['a'] = 2`
//* `freq['d'] = 1`
//
//That’s why `freq[c] > 1` tells us:
//👉 “This character repeated. Window is invalid.”
//
//---
//
//### ❓ `while (freq[c] > 1)`
//
//This is the **heart of the algorithm**.
//
//What this means:
//
//> As long as the current character appears more than once, the window is invalid.
//
//We don’t panic.
//We don’t restart.
//We **shrink from the left**.
//
//---
//
//### ❓ `freq[s.charAt(left)]--; left++;`
//
//This is surgical and elegant.
//
//Let’s slow it down.
//
//Suppose:
//
//```text
//Window = "sada"
//left = 0, right = 3
//freq['a'] = 2 ❌
//```
//
//We shrink:
//
//1. `s.charAt(left)` → `'s'`
//2. `freq['s']--` → remove `'s'` from window
//3. `left++` → move left boundary
//
//We keep shrinking until:
//
//```java
//freq[c] == 1
//```
//
//Now the window is valid again.
//
//---
//
//## WHY THIS ALWAYS WORKS (IMPORTANT)
//
//### Invariant (this word matters in interviews)
//
//At the end of every iteration:
//
//> The window `[left … right]` contains **no duplicate characters**
//
//We **only expand** when valid
//We **only shrink** when invalid
//
//That guarantees correctness.
//
//---
//
//## WHY TIME COMPLEXITY IS O(n)
//
//This is a classic interview trap.
//
//Even though there’s a `while` loop:
//
//* `right` moves from `0 → n`
//* `left` also moves from `0 → n`
//* No pointer ever moves backward
//
//So total operations ≤ `2n`
//
//👉 **O(n)** time
//👉 **O(1)** space (128 fixed size)
//## INTERVIEW-READY EXPLANATION (CLEAN VERSION)
//Say this:
//> “I use a sliding window with two pointers.
//> I maintain a frequency array to track characters in the current window.
//> I expand the window by moving the right pointer.
//> If a character repeats, I shrink the window from the left until it becomes valid again.
//> Throughout the process, I track the maximum window length.
//> Each character is added and removed at most once, so the solution runs in O(n) time.”
//That’s a strong answer.
//## ONE TWEAK QUESTION (CHECK YOUR DEPTH)
//Answer this out loud:
//👉 Why can’t we use sliding window for
//`Subarray Sum = K` **when negatives exist**,
//but we *can* use it here?
// Case 1: Sliding window with ONLY positive numbers ✅
//Example:
//arr = [2, 1, 3, 4]
//target = 5
//Expand window → sum increases
//Shrink window → sum decreases
//This predictability is why sliding window works.
//Your brain can safely say:
//“Sum too big? Shrink.”
//“Sum too small? Expand.”
//Case 2: Sliding window with negative numbers ❌
//Example:
//arr = [1, -1, 2, -2, 3]
//target = 3
//Now watch what breaks.
//Expand window → sum might increase OR decrease
//Shrink window → sum might increase OR decrease
//You lose control.
//There is no rule that says:
//expanding helps
//shrinking helps
//So sliding window has no direction to follow.
//🔴 The real reason (interview-level answer)
//Sliding window fails because the sum is not monotonic when negative numbers are present.
//That’s the key word: monotonic.

public class longestSubWithoutRepeatingChar {

    static class Sol{
        public int longestSubstring(String s){
            int[] freq = new int[128]; // we created new array & 128 is ASCII value where all a-z, A-Z, 1-n are in there so feasable I guess
            // then we created pointer left & right
            int left = 0, maxLen = 0;
            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right); // tbh I'm not sure how this is handling
                freq[c]++; // also this part what's inside that like freq we storing index of right?
                while (freq[c] > 1) {
                    freq[s.charAt(left)]--; // same goes for here internal working?
                    left++;
                }
                maxLen = Math.max(maxLen,right-left+1);
            }
            return maxLen;
            /// below is logic for interviewer above one is my silly questions
        }/// “I use a sliding window with a frequency array.
        /// I expand the window using the right pointer.
        /// If a character repeats, I shrink from the left until the window is valid again.
        /// I track the maximum window length and its starting index.”
    }

    static void main(String[] args) {
        String s= "sadadaf";
        Sol ss = new Sol();
        System.out.println(ss.longestSubstring(s));
    }
}
