package com.coding.programmers;

import java.io.IOException;

public class practice_measure {

    public static void main(String[] args) throws IOException {
        practice_measure main = new practice_measure();
//        System.out.println(
//                main.solution(new String[]{"mislav", "stanko", "mislav", "ana", "aba"}, new String[]{"stanko", "ana", "mislav"})
//        );
        System.out.println(
                main.solution(10)
        );
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer += i;
        }
        return answer;
    }

}



