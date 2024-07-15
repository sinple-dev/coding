package com.coding.programmers.level2;


public class bf_pirodo {

    public static void main(String[] args) {

        bf_pirodo main = new bf_pirodo();
        int[][] dungeons = {{80,20}, {50,40}, {30,10}};
        System.out.println(main.solution(80, dungeons));

    }

    public int answer = 0;
    public boolean[] visit;


    public int solution(int k, int[][] dungeons) {

        visit = new boolean[dungeons.length];

        dfs(0, dungeons, k);

        return answer;
    }

    public void dfs(int depth, int[][] dungeons, int k) {

        for (int i = 0; i < dungeons.length; i++) {

            if (visit[i] == false && dungeons[i][0] <= k) {

                visit[i] = true;
                dfs(depth + 1, dungeons, k - dungeons[i][1]);
                visit[i] = false;
            }

        }

        answer = Math.max(answer, depth);

    }


}
