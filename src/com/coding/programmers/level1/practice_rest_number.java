package com.coding.programmers.level1;

import java.io.IOException;

public class practice_rest_number {

    public static void main(String[] args) throws IOException {
        practice_rest_number main = new practice_rest_number();
//        System.out.println(
//                main.solution(new String[]{"mislav", "stanko", "mislav", "ana", "aba"}, new String[]{"stanko", "ana", "mislav"})
//        );
        System.out.println(
                main.solution(10)
        );
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 1) return i;
        }

        return answer;
    }

}



