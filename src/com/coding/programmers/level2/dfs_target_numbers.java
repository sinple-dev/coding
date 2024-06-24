package com.coding.programmers.level2;


public class dfs_target_numbers {
    public static void main(String[] args) {

        dfs_target_numbers main = new dfs_target_numbers();
        int[] numbers = {1,1,1,1,1};

        System.out.println(main.solution(numbers, 3));

    }

    int answer = 0;

    public int solution(int[] numbers, int target) {

        dfs(numbers, 0, target, 0);

        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) {
            if (sum == target) answer++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }

    }


}
