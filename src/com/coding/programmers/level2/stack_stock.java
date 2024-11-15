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
        int[] answer = new int[prices.length];  // 각 주식 가격이 떨어지기까지 걸린 시간을 저장할 배열
        Stack<Integer> stack = new Stack<>();   // 인덱스를 저장할 스택

        // 주식 가격을 순차적으로 확인하면서 처리
        for (int i = 0; i < prices.length; i++) {
            // 스택이 비어있지 않고, 현재 주식 가격이 스택의 맨 위의 주식 가격보다 낮으면
            // 즉, 주식 가격이 떨어진 경우
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();  // 떨어지기까지 걸린 시간 계산
                stack.pop();  // 스택에서 인덱스 제거
            }
            stack.push(i);  // 현재 인덱스를 스택에 추가
        }

        // 스택에 남아있는 인덱스들은 가격이 끝까지 떨어지지 않은 주식들
        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;  // 마지막까지 떨어지지 않은 주식은 끝까지 기다린 시간
            stack.pop();  // 스택에서 인덱스 제거
        }

        return answer;  // 결과 배열 반환
    }

}
