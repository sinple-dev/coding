package com.coding.programmers;

import java.util.PriorityQueue;

public class practice_scoville {

    public static void practice_scoville(String[] args) {
        practice_scoville main = new practice_scoville();
        System.out.println(main.solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public int solution(int[] scoville, int K) {
        int answer = 0;

        // arraylist 쓰면 효율성이 떨어져
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int no : scoville) {
            q.add(no);
        }

        while (q.size() > 1 && q.peek() < K) {
            int a = q.poll();
            int b = q.poll();
            int tmp = a + (b * 2);
            q.add(tmp);
            answer++;
        }

        return (q.size() < 2 && q.peek() < K) ? -1 : answer;
    }
}
