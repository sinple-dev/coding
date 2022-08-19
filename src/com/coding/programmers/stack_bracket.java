package com.coding.programmers;

import java.util.Stack;

public class stack_bracket {

    public static void stack_bracket() {
        stack_bracket main = new stack_bracket();
        System.out.println(main.solution("()()"));

    }

    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (stack.size() == 0) {
                stack.push(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }

        return stack.size() == 0 ? true : false;
    }

}
