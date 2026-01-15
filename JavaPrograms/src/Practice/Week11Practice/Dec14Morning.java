package Practice.Week11Practice;

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

}
public class Dec14Morning {
    static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(2);
        ms.push(8);
        System.out.println(ms.getMin());
        System.out.println(ms.top());
        ms.pop();
        System.out.println(ms.top());
        System.out.println(ms.getMin());
    }
}
