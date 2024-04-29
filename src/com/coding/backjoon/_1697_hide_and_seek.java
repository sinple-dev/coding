package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1697_hide_and_seek {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        int[] dist = new int[100001];

        q.add(start);

        while (!q.isEmpty()) {
            int k = q.remove();
            if (k == end) {
                break;
            }

            int x1 = k + 1;
            int x2 = k - 1;
            int x3 = 2 * k;

            if (x1 < 100001 && dist[x1] == 0) {
                q.add(x1);
                dist[x1] = dist[k] + 1;
            }

            if (x2 >= 0 && dist[x2] == 0) {
                q.add(x2);
                dist[x2] = dist[k] + 1;
            }

            if (x3 < 100001 && dist[x3] == 0) {
                q.add(x3);
                dist[x3] = dist[k] + 1;
            }
        }
        System.out.println(dist[end]);

    }

}
