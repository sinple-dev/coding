package com.coding.programmers.level1;

import java.io.IOException;
import java.util.Stack;

public class stack_not_same_number {

    public static void main(String[] args) throws IOException {
        stack_not_same_number main = new stack_not_same_number();
        System.out.println(main.solution(new int[]{1, 1, 3, 3, 0, 1, 1})
        );
    }

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;

    }
}



