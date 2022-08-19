package com.coding.programmers;

import java.io.IOException;

public class dev_matrix {

    public static void main(String[] args) throws IOException {
        dev_matrix main = new dev_matrix();

//        System.out.println(main.solution(6, 6, new int[][]{{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}}));
        System.out.println(main.solution(100, 97, new int[][]{{1, 1, 100, 97}}));

    }

    int[][] arr;

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        arr = new int[rows][columns];

        int no = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                no++;
                arr[i][j] = no;
            }
        }

        for (int i = 0; i < queries.length; i++) {
            answer[i] = rotate(queries[i]);
        }

        return answer;
    }


    public int rotate(int[] query) {

        int x1 = query[0] - 1;
        int y1 = query[1] - 1;
        int x2 = query[2] - 1;
        int y2 = query[3] - 1;

        int tmp = arr[x1][y2];
        int min = tmp;

        for (int i = y2; i > y1; i--) {
            min = Math.min(min, arr[x1][i]);
            arr[x1][i] = arr[x1][i - 1];
        }
        for (int i = x1; i < x2; i++) {
            min = Math.min(min, arr[i][y1]);
            arr[i][y1] = arr[i + 1][y1];
        }
        for (int i = y1; i < y2; i++) {
            min = Math.min(min, arr[x2][i]);
            arr[x2][i] = arr[x2][i + 1];
        }
        for (int i = x2; i > x1; i--) {
            min = Math.min(min, arr[i][y2]);
            arr[i][y2] = arr[i - 1][y2];
        }
        arr[x1+1][y2] = tmp;
        return min;
    }

}



