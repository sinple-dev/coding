package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10974_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        arr = new int[n];
        res = new int[n];

        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        dfs(0);

        System.out.println(sb);
    }

    static StringBuilder sb = new StringBuilder();
    static int answer = 0;
    static int[] arr, res;
    static boolean[] visit;

    static public void dfs(int depth) {
        if (depth == arr.length) {
            for (int i : res) {
                sb.append(i + " ");
            }
            sb.append("\n");
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                res[depth] = i+1;
                dfs(depth + 1);
                visit[i] = false;
            }

        }

    }


}
