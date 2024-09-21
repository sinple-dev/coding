package com.coding.programmers.level2;

import java.util.Arrays;

public class fullscan_carpet {

    public static void main(String[] args) {
        fullscan_carpet main = new fullscan_carpet();
        System.out.println(Arrays.toString(main.solution(10, 2)));
    }


    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // 가로가 4
        // 세로가 3

        int total = brown + yellow;

        for (int i = 1; i <= total; i++) {
            int row = i;
            int col = total / i ;

            if (row < col) {
                continue;
            }

            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = row;
                answer[1] = col;
                return answer;
            }
        }

        return answer;
    }


}
