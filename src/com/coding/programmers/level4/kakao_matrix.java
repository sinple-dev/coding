package com.coding.programmers.level4;

import java.io.IOException;
import java.util.Arrays;

public class kakao_matrix {

    public static void kakao_matrix(String[] args) throws IOException {
        kakao_matrix main = new kakao_matrix();

        // 효율성 체크 실패, 큐를 이용해서 수정해야 함
        System.out.println(Arrays.deepToString(main.solution(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new String[]{"Rotate", "ShiftRow"})));

    }

    int[][] matrix;

    public int[][] solution(int[][] rc, String[] operations) {
        matrix = rc;
        for (int i = 0; i < operations.length; i++) {
            algorithm(operations[i]);
        }
        return matrix;
    }

    public void algorithm(String operation) {
        if (operation.equals("ShiftRow")) {
            shiftRow();
        } else {
            rotate();
        }
    }

    public void shiftRow() {
        int[] last = matrix[matrix.length - 1];
        for (int i = matrix.length - 1; i > 0; i--) {
            matrix[i] = matrix[i - 1];
        }
        matrix[0] = last;
    }

    public void rotate() {

        int x1 = 0;
        int y1 = 0;
        int x2 = matrix[0].length - 1;
        int y2 = matrix.length - 1;

        int tmp = matrix[x1][y1];

        for (int i = 0; i < y2; i++) {
            matrix[i][x1] = matrix[i + 1][x1];
        }

        for (int i = 0; i < x2; i++) {
            matrix[y2][i] = matrix[y2][i + 1];
        }

        for (int i = y2; i > 0; i--) {
            matrix[i][x2] = matrix[i - 1][x2];
        }

        for (int i = x2; i > 0; i--) {
            matrix[y1][i] = matrix[y1][i - 1];
        }

        matrix[0][1] = tmp;

    }

}



