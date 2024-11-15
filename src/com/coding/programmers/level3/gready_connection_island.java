package com.coding.programmers.level3;

import java.util.Arrays;

public class gready_connection_island {

    public static void main(String[] args) {
        gready_connection_island main = new gready_connection_island();

        int[][] costs = {{0,1,1}, {0,2,2}, {1,2,5}, {1,3,1}, {2,3,8}};
        System.out.println(main.solution(4, costs));
    }


    public int solution(int n, int[][] costs) {

        int answer = 0;
        int[] island = new int[n];

        for (int i =0; i<n; i++) {
            island[i] = i;
        }

        Arrays.sort(costs, (a, b) -> a[2] - b[2]);

        for (int i =0; i< costs.length; i++) {
            if (find(island, costs[i][0]) != find(island, costs[i][1])) {
                union(island, costs[i][0], costs[i][1]);
                answer += costs[i][2];
            }
        }

        return answer;

    }

    public int find(int[] island, int x) {
        if (island[x] == x) {
            return x;
        }
        return island[x] = find(island, island[x]);
    }

    public void union(int[] island, int x, int y) {
        int a = find(island, x);
        int b = find(island, y);
        if (a < b) {
            island[b] = a;
        } else {
            island[a] = b;
        }
    }



    // public int solution2(int n, int[][] costs) {
    //     int sum = 0;
    //     int[] island = new int[n];
    //
    //     for(int i = 0; i < n; i++)
    //         island[i] = i;
    //
    //     Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));
    //
    //     for (int i = 0; i < costs.length; i++) {
    //
    //         if(find(island, costs[i][0]) != find(island, costs[i][1]))
    //         {
    //             unite(island, costs[i][0], costs[i][1]);
    //             sum += costs[i][2];
    //         }
    //     }
    //
    //     return sum;
    // }
    //
    // private int find(int[] island, int x)
    // {
    //     if(island[x] == x)
    //         return x;
    //     return find(island, island[x]);
    // }
    //
    // private void unite(int[] island, int x, int y)
    // {
    //     int a = find(island, x);
    //     int b = find(island, y);
    //     island[a] = b;
    // }

}
