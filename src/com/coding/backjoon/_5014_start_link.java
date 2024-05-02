package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _5014_start_link {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int top = Integer.parseInt(st.nextToken());
        int my = Integer.parseInt(st.nextToken());
        int dest = Integer.parseInt(st.nextToken());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());


        Queue<Integer> q = new LinkedList<>();

        int[] dist = new int[1000001];

        q.add(my);

        while (!q.isEmpty()) {
            int k = q.remove();
            if (k == dest) {
                break;
            }
            int x1 = k + up;
            int x2 = k - down;

            if (x1 <= top && dist[x1] == 0) {
                q.add(x1);
                dist[x1] = dist[k] + 1;
            }
            if (x2 > 0 && x2 < 1000001 && dist[x2] == 0) {
                q.add(x2);
                dist[x2] = dist[k] + 1;
            }
        }

        if (my == dest) System.out.println(0);
        else {
            System.out.println(dist[dest] == 0 ? "use the stairs" : dist[dest]);
        }

    }

}
