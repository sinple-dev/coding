package com.coding.programmers.level2;

import java.util.Arrays;

public class greedy_big_number {

    public static void main(String[] args) {

        greedy_big_number main = new greedy_big_number();


        System.out.println(main.solution("1924", 2));

    }

    public String solution(String number, int k) {

        int idx = 0;
        char max;
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < number.length() - k; i++) {
            max = '0';
            for (int j = idx; j <= i + k; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    idx = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }

}
