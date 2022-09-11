package com.coding.programmers;

import java.io.IOException;

public class practice_reverse {

    public static void main(String[] args) throws IOException {
        practice_reverse main = new practice_reverse();
        System.out.println(
                main.solution(12345)
        );
    }

    public int[] solution(long n) {
        String txt = n + "";
        int[] answer = new int[txt.length()];
        int i=0;
        while (n > 0) {
            answer[i] = (int) (n % 10);
            n = n / 10;
            i++;
        }
        return answer;
    }

}



