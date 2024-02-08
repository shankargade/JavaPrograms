package collection_programs;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Shankar");
        stack.add("Pravin");
        stack.add("Jyoti");
        stack.add("Saurabh");
        System.out.println(stack);
        System.out.println(stack.pop());
        stack.push("Ganesh");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.search("Jyoti"));

    }
}
