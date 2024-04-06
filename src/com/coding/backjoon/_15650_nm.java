package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _15650_nm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n];

        dfs(n, m, 0);

        System.out.print(sb);
    }

    static Set<String> set = new HashSet<>();
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    private static void dfs(int n, int m, int d) {
        if(d == m) {
            for(int a : arr) {
                set.add(a +1 + " ");
                sb.append(a +1 + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[d] = i;
                dfs(n, m, d+1);
                visit[i] = false;
            }
        }
    }
}
