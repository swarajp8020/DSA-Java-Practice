package Practice.Week11Practice;

import java.util.Stack;

class MinStack1 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack1(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }
    public void pop(){
        stack.pop();
        minStack.pop();
    }
    public int top() {return stack.peek();}
    public int getMin() {return minStack.peek();}
}

public class Dec16Morning {
    static void main(String[] args) {
        MinStack1 ms = new MinStack1();
        ms.push(5);
        ms.push(2);
        ms.push(8);
        System.out.println(ms.getMin()); // 2
        System.out.println(ms.top());    // 8
        ms.pop();
        System.out.println(ms.top());    // 2
        System.out.println(ms.getMin()); // 2
    }
}
