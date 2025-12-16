package Practice.WeekdayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dec16Morning {
    /// Frequency Map
    static void main(String[] args) {
        String s = "leetcode";
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            freq[index]++;
        }
        System.out.println(Arrays.toString(freq));
    }

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
