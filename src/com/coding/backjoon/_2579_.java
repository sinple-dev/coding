package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2579_ {


    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        dp = new Integer[N + 1];
        arr = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp[0] = 0;
        dp[1] = arr[1];
        dp[2] = arr[2] + dp[1];

        System.out.println(find(N));

    }

    static public int find(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(find(n-3) + arr[n-1], find(n-2)) + arr[n];
        }

        return dp[n];
    }

}
