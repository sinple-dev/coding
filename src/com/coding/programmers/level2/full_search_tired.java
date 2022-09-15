package com.coding.programmers.level2;

public class full_search_tired {
    public static void full_search_tired(String[] args) {
        full_search_tired main = new full_search_tired();
        main.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}});
    }
    public int answer = 0;
    public boolean[] visit;

    public int solution(int k, int[][] dungeons) {

        visit = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }

    public void dfs(int depth, int k, int[][] dungeons) {

        for (int i = 0; i < dungeons.length; i++) {

            if (k >= dungeons[i][0] && !visit[i]) {
                visit[i] = true;
                dfs(depth+1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
        }

        answer = Math.max(answer, depth);

    }

}
