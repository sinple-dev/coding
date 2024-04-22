package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2667_danji {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        N = Integer.parseInt(st.nextToken());


        map = new int[N][N];
        visited = new boolean[N][N];
        cnt = new int[10000]; // 최대 10000개의 단지가 존재할 수 있음

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    dfs(i, j);
                    count++;
                }
            }
        }

        System.out.println(count);

        for (int i = 1; i <= count; i++) {
            System.out.println(cnt[i - 1]);
        }
    }


    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int count;
    static int[] cnt;

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        cnt[count]++;

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {

                int nx = x + dx;
                int ny = y + dy;

                if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                    continue;
                }

                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
