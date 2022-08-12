package com.coding;

import java.io.IOException;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();


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



