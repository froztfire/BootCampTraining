package Practice;

import java.util.Stack;

public class WorkingWithStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Last Item: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Item pop: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
        System.out.println("Stack is empty?: " + stack.empty());
    }
}
