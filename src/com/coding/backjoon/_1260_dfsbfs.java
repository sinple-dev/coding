package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1260_dfsbfs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());


        int[][] arr = new int[n+1][n+1];
        LinkedList[] arr2 = new LinkedList[n + 1];

        boolean[] visit = new boolean[n+1];
        boolean[] visit2 = new boolean[n+1];

        for (int i = 0; i <= n; i++) {
            arr2[i] = new LinkedList<Integer>();
        }

        for(int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            arr[a][b] = arr[b][a] = 1;

            arr2[a].add(b);
            arr2[b].add(a);
        }

        dfs(arr, visit, v);
        System.out.println();
        bfs(arr2, visit2, v);

    }

    public static void dfs(int[][] arr, boolean[] visit, int start) {
        visit[start] = true;
        System.out.print(start + " ");

        for(int i = 1; i < arr.length; i++) {
            if(arr[start][i] == 1 && !visit[i]) {
                dfs(arr, visit, i);
            }
        }
    }

    public static void bfs(LinkedList<Integer>[] arr, boolean[] visit, int start) {
        Queue<Integer> queue = new LinkedList<>();
        visit[start] = true;
        queue.add(start);

        while(!queue.isEmpty()) {
            start = queue.poll();
            System.out.print(start + " ");

            Iterator<Integer> iter = arr[start].listIterator();
            while(iter.hasNext()) {
                int w = iter.next();
                if(!visit[w]) {
                    visit[w] = true;
                    queue.add(w);
                }
            }
        }
    }

}
