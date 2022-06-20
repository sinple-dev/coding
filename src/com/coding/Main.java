package com.coding;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        int[] priorities = {2, 1, 3, 2};
        main.solution(priorities, 2);
    }


    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                // 제일 우선순위 높은거 찾고
                if (priorities[i] == pq.peek()) {
                    // 찾은게 내가 찾고싶던 location의 값이면 리턴
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    // 아니면 뽑아내고 answer 증가
                    pq.poll();
                    answer++;
                }
            }
        }
        return -1;
    }

}
