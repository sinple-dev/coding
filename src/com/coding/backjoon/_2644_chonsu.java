package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _2644_chonsu {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        map = new int[N+1][N+1];
        dist = new int[N+1];

        StringTokenizer line = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(line.nextToken());
        end = Integer.parseInt(line.nextToken());


        int top = Integer.parseInt(br.readLine());

        for (int i = 0; i < top; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            map[a][b] = map[b][a] = 1;
        }


        dfs(start);

        System.out.println(dist[end] == 0 ? -1 : dist[end]);
    }

    static int N;
    static int end;
    static int[][] map;
    static int[] dist;

    public static void dfs(int x) {
        if (x == end) {
            return;
        }
        for (int i=1; i<=N; i++) {
            if (map[x][i] == 1 &&  dist[i] == 0) {
                dist[i] = dist[x]+1;
                dfs(i);
            }
        }
    }
}
