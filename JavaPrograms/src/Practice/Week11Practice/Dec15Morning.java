package Practice.Week11Practice;
import java.util.Stack;

//class MinStack1 {
//    private Stack<Integer> stack;
//    private Stack<Integer> minStack;
//    public MinStack1(){
//        stack = new Stack<>();
//        minStack = new Stack<>();
//    }
//    public void push(int val) {
//        stack.push(val);
//        if (minStack.isEmpty()) {
//            minStack.push(val);
//        } else {
//            minStack.push(Math.min(val, minStack.peek()));
//        }
//    }
//    public void pop() {
//        stack.pop();
//        minStack.pop();
//    }
//    public int top() {
//        return stack.peek();
//    }
//    public int getMin() {
//        return minStack.peek();
//    }
//}
class MyQueue1 {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;
    public MyQueue1(){
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    public void push(int x){
        inStack.push(x);
    }
    public int pop(){
        shiftStack();
        return outStack.pop();
    }
    public int peek(){
        shiftStack();
        return outStack.peek();
    }
    public boolean empty(){
        return outStack.isEmpty() && inStack.isEmpty();
    }
    public void shiftStack(){
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
public class Dec15Morning {
    static void main(String[] args) {
        MyQueue1 q = new MyQueue1();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.peek());  // 1
        System.out.println(q.pop());   // 1
        System.out.println(q.pop());   // 2
        System.out.println(q.empty()); // false
        System.out.println(q.pop());   // 3
        System.out.println(q.empty()); // true
    }
//    static void main(String[] args) {
//        MinStack1 ms = new MinStack1();
//        ms.push(5);
//        ms.push(2);
//        ms.push(8);
//        System.out.println(ms.getMin());
//        System.out.println(ms.top());
//        ms.pop();
//        System.out.println(ms.top());
//        System.out.println(ms.getMin());
//    }
}
