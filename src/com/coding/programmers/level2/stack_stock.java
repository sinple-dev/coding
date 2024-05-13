package com.coding.programmers.level2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Stack;

public class stack_stock {

    public static void main(String[] args) throws IOException {
        stack_stock main = new stack_stock();


        int[] numbers = {1, 2, 3, 2, 1};

        System.out.println(Arrays.toString(main.solution(numbers)));

    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }

}
