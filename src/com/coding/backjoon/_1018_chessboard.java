package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018_chessboard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        char[][] board = new char[m][n];
        for (int i = 0; i < m; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i <= m - 8; i++) {
            for (int j = 0; j <= n - 8; j++) {
                int count1 = countRepaint(board, i, j, board[i][j]);
                minCount = Math.min(count1, minCount);
            }
        }

        System.out.println(minCount);
    }

    private static int countRepaint(char[][] board, int startRow, int startCol, char color) {
        int count = 0;
        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if (i == startRow && j == startCol) {
                    continue;
                }
                if ((startCol + startRow) % 2 == 0) {
                    if ((i + j) % 2 == 0 && board[i][j] != color) {
                        count++;
                    }

                    if ((i + j) % 2 == 1 && board[i][j] == color) {
                        count++;
                    }

                }

                if ((startCol + startRow) % 2 == 0) {
                    if ((i + j) % 2 == 0 && board[i][j] == color) {
                        count++;
                    }

                    if ((i + j) % 2 == 1 && board[i][j] != color) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}