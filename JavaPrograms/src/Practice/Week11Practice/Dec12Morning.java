package Practice.Week11Practice;

import java.util.Arrays;
import java.util.Stack;

public class Dec12Morning {
    public static int[] dailyTemperatures(int[] tempratures) {
        int n = tempratures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && tempratures[i] > tempratures[stack.peek()]) {
                int prevIndex = stack.pop();
                ans[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return ans;
    }

    static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(result));
    }
//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (char ch:s.toCharArray()) {
//            if (ch == '(' || ch == '{' || ch == '[') {
//                stack.push(ch);
//            } else {
//                if (stack.isEmpty()) return false;
//                char top = stack.pop();
//                if (ch == ')' && top != '(') return false;
//                if (ch == ']' && top != '[') return false;
//                if (ch == '}' && top != '{') return false;
//            }
//        }
//        return stack.isEmpty();
//    }
//
//    static void main(String[] args) {
//        System.out.println(isValid("{[()]}"));
//        System.out.println(isValid("(]"));
//    }
}
