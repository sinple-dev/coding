package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15649_nm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n];

        // dfs(n, m, 0);

        dfs2(0);

        System.out.print(sb);
    }

    static int n;
    static int m;
    static int[] arr;
    static boolean[] visit;

    static public void dfs2(int index) {

        if (arr.length == index) {
            for (int a : arr) {
                System.out.print(a+1 + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[index] = i;
                dfs2(index + 1);
                visit[i] = false;
            }
        }
    }





    static StringBuilder sb = new StringBuilder();

    private static void dfs(int n, int m, int d) {
        if(d == m) {
            for(int a : arr) sb.append(a + " ");
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[d] = i;
                dfs(n, m, d+1);
                visit[i] = false;
            }
        }
    }


}
