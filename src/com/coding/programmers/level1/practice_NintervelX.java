package com.coding.programmers.level1;

import java.io.IOException;

public class practice_NintervelX {

    public static void main(String[] args) throws IOException {
        practice_NintervelX main = new practice_NintervelX();
        System.out.println(
                main.solution(2, 5)
        );
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long no = x;

        for (int i = 0; i < n; i++) {
            answer[i] = no;
            no = no + x;
        }

        return answer;
    }

}



