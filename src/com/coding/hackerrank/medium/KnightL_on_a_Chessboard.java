
package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;
import java.util.stream.Stream;

public class KnightL_on_a_Chessboard {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> result = Result13.knightlOnAChessboard(n);

		result.stream()
			.map(
				r -> r.stream()
					.map(Object::toString)
					.collect(joining(" "))
			)
			.map(r -> r + "\n")
			.collect(toList())
			.forEach(e -> {
				System.out.print(e);
			});

		bufferedReader.close();
	}
}

class Result13 {

	public static List<List<Integer>> knightlOnAChessboard(int n) {
		// Write your code here

		int[][] result = new int[n][n];
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < n; j++) {
				result[i][j] = bfs(n, i, j);
			}
		}

		List<List<Integer>> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			List<Integer> l = new LinkedList<>();
			for (int j = 0; j < n; j++) {
				l.add(result[i][j]);
			}
			list.add(l);
		}
		return list;
	}

	public static int bfs(int n, int a, int b) {
		int[] dx = {a, a, -a, -a, b, b, -b, -b};
		int[] dy = {b, -b, b, -b, a, -a, a, -a};

		boolean[][] visited = new boolean[n][n];

		Queue<point> q = new LinkedList<>();
		int result = -1;
		q.add(new point(a, b, 1));
		while(!q.isEmpty()) {

			point p = q.poll();

			if (p.x == n - 1 && p.y == n - 1) {
				result = p.step;
				break;
			}

			for (int i = 0; i < 8; i++) {
				int x = p.x + dx[i];
				int y = p.y + dy[i];
				int step = p.step + 1;

				if (x < 0 || y < 0 || x > n - 1 || y > n - 1 || visited[x][y]) {
					continue;
				}
				visited[x][y] = true;
				q.add(new point(x, y, step));
			}
		}

		return result;
	}

	static class point {
		private int x;
		private int y;
		private int step;

		public point(int x, int y, int step) {
			this.x = x;
			this.y = y;
			this.step = step;
		}
	}

}
