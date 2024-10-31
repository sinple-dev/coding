package com.coding.programmers.level2;

import java.util.Stack;

public class bf_wires {

    public static void main(String[] args) {
        bf_wires main = new bf_wires();
        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
        main.solution(9, wires);
    }

    boolean[] visit;
    int[][] arr;
    int total = 0;

    public int solution(int n, int[][] wires) {
        int answer = 99;
        total = n;

        arr = new int[total + 1][total + 1];
		for (int[] ints : wires) {
			arr[ints[0]][ints[1]] = 1;
			arr[ints[1]][ints[0]] = 1;
		}

		for (int[] wire : wires) {

			int topA = wire[0];
			int topB = wire[1];

			arr[topA][topB] = 0;
			arr[topB][topA] = 0;

			int cnt = dfs(topA);
			answer = Math.min(answer, Math.abs(total - cnt - cnt));

			arr[topA][topB] = 1;
			arr[topB][topA] = 1;

		}
        return answer;
    }

    public int dfs(int topA) {

        Stack<Integer> stack = new Stack();
        stack.push(topA);

        visit = new boolean[total+1];
        int cnt = 1;

        while (!stack.empty()) {
            int node = stack.pop();
            visit[node] = true;

            for (int i = 1; i <= total; i++) {
                  if (visit[i]) continue;
                if (arr[node][i] == 1) {
                    stack.push(i);
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
