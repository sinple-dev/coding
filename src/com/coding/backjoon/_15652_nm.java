package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15652_nm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n+1];

        dfs(n, m, 0);

        System.out.print(sb);
    }

    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    private static void dfs(int n, int m, int d) {
        if(d == m) {
            if (arr[d-2] < arr[d-1]) {
                for(int a : arr) sb.append(a + " ");
                sb.append("\n");
                arr[d-1] = 0;
            }
            return;
        }

        for(int i = 1; i <= n; i++) {
            arr[d] = i;
            if (arr[d] <= i) {
                dfs(n, m, d+1);
            }
        }
    }
}
