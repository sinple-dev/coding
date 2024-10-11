package com.coding.hackerrank.medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

public class Even_Tree {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] tNodesEdges = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int tNodes = Integer.parseInt(tNodesEdges[0]);
		int tEdges = Integer.parseInt(tNodesEdges[1]);

		List<Integer> tFrom = new ArrayList<>();
		List<Integer> tTo = new ArrayList<>();

		IntStream.range(0, tEdges).forEach(i -> {
			try {
				String[] tFromTo = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

				tFrom.add(Integer.parseInt(tFromTo[0]));
				tTo.add(Integer.parseInt(tFromTo[1]));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int res = Result17.evenForest(tNodes, tEdges, tFrom, tTo);

		System.out.println(res);

		bufferedReader.close();
	}
}

class Result17 {

	static int evenForest(int t_nodes, int t_edges, List<Integer> t_from, List<Integer> t_to) {
		// 간선 제거해서 짝수가 되도록
		int[][] graph = new int[t_nodes + 1][t_nodes + 1];

		int count = 0;

		for (int i = 0; i < t_edges; i++) {
			int from = t_from.get(i);
			int to = t_to.get(i);
			graph[from][to] = 1;
			graph[to][from] = 1;
		}

		for (int i = 0; i < t_edges; i++) {
			int from = t_from.get(i);
			int to = t_to.get(i);
			graph[from][to] = 0;
			graph[to][from] = 0;

			int dfs = dfs(graph, from);
			if (dfs % 2 == 0) {
				count++;
			} else {
				graph[from][to] = 1;
				graph[to][from] = 1;
			}
		}

		return count;
	}

	public static int dfs(int[][] graph, int node) {
		int count = 1;
		boolean[] visit = new boolean[graph.length];

		visit[node] = true;
		Queue<Integer> q = new LinkedList<>();
		q.add(node);

		while (!q.isEmpty()) {
			int n = q.poll();
			for (int i = 1; i < graph[n].length; i++) {
				if (graph[n][i] == 1 && !visit[i]) {
					visit[i] = true;
					count++;
					q.add(i);
				}
			}
		}

		return count;
	}
}
