package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _6064_kaing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        StringTokenizer st1;
        boolean tf = false;


        for (int i = 1; i <= cnt; i++) {
            st1 = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st1.nextToken());
            int m = Integer.parseInt(st1.nextToken());
            int x = Integer.parseInt(st1.nextToken())-1;
            int y = Integer.parseInt(st1.nextToken())-1;

            for (int j = x; j < n * m; j += n) {

                if (j % m == y) {
                    System.out.println(j + 1);
                    tf = true;
                    break;
                }
            }
            if (!tf) {
                System.out.println(-1);
            }
            tf = false;
        }
    }
}
