package com.coding.programmers.level1;

import java.io.IOException;

public class practice_collatz {

    public static void main(String[] args) throws IOException {
        practice_collatz main = new practice_collatz();
        System.out.println(
                main.solution(5)
        );
    }


    public int solution(int num) {
        int answer = 0;
        if (num == 1) return 0;
        long no = num;
        while (no != 1) {
            if (no % 2 == 0) {
                no = no / 2;
            } else {
                no = no * 3 + 1;
            }
            answer++;

            if (answer == 500) return -1;
        }

        return answer;
    }
}



