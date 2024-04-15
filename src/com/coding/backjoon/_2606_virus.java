package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2606_virus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] arr = new int[n+1][n+1];
        boolean[] visit = new boolean[n+1];

        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(arr, visit, 1);

        System.out.println(cnt - 1);
    }

    static int cnt = 0;

    public static void dfs(int[][] arr, boolean[] visit, int start) {
        visit[start] = true;
        cnt++;
        for(int i = 1; i < arr.length; i++) {
            if(arr[start][i] == 1 && !visit[i]) {
                dfs(arr, visit, i);
            }
        }
    }
}
