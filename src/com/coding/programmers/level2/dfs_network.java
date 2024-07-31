package com.coding.programmers.level2;


public class dfs_network {
    public static void main(String[] args) {

        dfs_network main = new dfs_network();
        int[][] computers = {{1,1,0}, {1,1,1}, {0,1,1}};
        System.out.println(main.solution(3, computers));

    }

    public int solution(int n, int[][] computers) {

        int answer = 0;
        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            if(!check[i]) {
                dps(computers, n, check, i);
                answer++;
            }

        }
        return answer;
    }

    public void dps(int[][] computers, int n, boolean[] check, int index) {
        check[index] = true;
        for(int j=0; j< n; j++) {
            if(index != j && !check[j] && computers[index][j] == 1) {
                dps(computers, n, check, j);
            }
        }
    }

}
