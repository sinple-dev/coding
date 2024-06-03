package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1463_make_one {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        arr = new int[1000001];
        arr[2] = 1;
        arr[3] = 1;


        for (int i = 4; i <= n; i++) {
            if (i % 6 == 0) {

                arr[i] = Math.min(arr[i - 1], Math.min(arr[i/3], arr[i/2])) + 1;

            } else if (i % 3 == 0) {

                arr[i] = Math.min(arr[i/3], arr[i-1]) + 1;

            } else if (i % 2 == 0) {

                arr[i] = Math.min(arr[i/2], arr[i-1]) + 1;

            } else {

                arr[i] = arr[i-1] + 1;
            }

        }

        System.out.println(arr[n]);
    }

    static int[] arr;
}
