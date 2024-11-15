package com.coding.programmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class graph_long_node {

    public static void main(String[] args) {
        graph_long_node main = new graph_long_node();

        int[][] costs = {{3,6}, {4, 3}, {3,2}, {1,3}, {1,2}, {2,4}, {5,2}};
        System.out.println(main.solution(6, costs));


    }


    public int solution(int n, int[][] edge) {

        int answer = 0;

        ArrayList<Integer>[] list = new ArrayList[n+1];
        for (int i=1; i<=n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i=0; i<edge.length; i++) {
            list[edge[i][0]].add(edge[i][1]);
            list[edge[i][1]].add(edge[i][0]);
        }


        int[] distance = new int[n+1];
        boolean[] visited = new boolean[n+1];

        Queue<Integer> q = new LinkedList<>();
        q.add(1);

        while(!q.isEmpty()) {
            int current = q.poll();
            visited[current] = true;

            for (int a : list[current]) {
                if (!visited[a]) {
                    visited[a] = true;
                    distance[a] = distance[current] + 1;
                    q.add(a);
                }
            }
        }

        int maxDistance = Arrays.stream(distance).max().getAsInt();
        long count = Arrays.stream(distance).filter(d -> d == maxDistance).count();

        return (int) count;

    }

}
