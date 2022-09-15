package com.coding.programmers.level3;


public class dp_n_number {

    public static void dfs_n_number(String[] args) {

        dp_n_number main = new dp_n_number();
        System.out.println(main.solution(5, 12));

    }

    static int answer = Integer.MAX_VALUE;

    public int solution(int N, int number) {

        dfs(0, N, number, 0);

        if (answer == Integer.MAX_VALUE) return -1;
        return answer;
    }

    public void dfs(int depth, int N, int number, int value) {
        if (depth > 8) {
            return;
        }

        if (value == number) {
            answer = Math.min(depth, answer);
            return;
        }

        int temp = 0;

        for (int i = 0; i < 8; i++) {
            if (depth + i < 8) {
                temp = temp * 10 + N;
                dfs(depth + i + 1, N, number, value + temp);
                dfs(depth + i + 1, N, number, value - temp);
                dfs(depth + i + 1, N, number, value * temp);
                dfs(depth + i + 1, N, number, value / temp);

            }
        }
    }


}
