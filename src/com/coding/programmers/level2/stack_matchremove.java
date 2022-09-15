package com.coding.programmers.level2;

import java.io.IOException;
import java.util.Stack;

public class stack_matchremove {

    public static void main(String[] args) throws IOException {
        stack_matchremove main = new stack_matchremove();

        System.out.println(main.solution("()()"));

    }


    public int solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (stack.size() == 0) {
                stack.push(s.charAt(i));
                continue;
            }

            if (stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }

}



