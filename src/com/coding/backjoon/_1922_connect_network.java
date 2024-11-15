package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Edge implements Comparator<Edge> {
	int start;
	int end;
	int weight;

	public Edge(int start, int end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}

	@Override
	public int compare(Edge o1, Edge o2) {
		return o1.weight - o2.weight;
	}
}

public class _1922_connect_network {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int m = Integer.parseInt(br.readLine());

		int[] parent = new int[n+1];
		ArrayList<Edge> edges = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());

			edges.add(new Edge(start, end, weight));
		}

		Collections.sort(edges, (a, b) -> Integer.compare(a.weight, b.weight));

		for (int i = 1; i <= n; i++) {
			parent[i] = i;
		}

		int answer = 0;
		for (int i =0; i < m; i++) {
			if (find(parent, edges.get(i).start) != find(parent, edges.get(i).end)) {
				union(parent, edges.get(i).start, edges.get(i).end);
				answer += edges.get(i).weight;
			}
		}

		System.out.println(answer);

	}

	static public int find(int[] arr, int target) {
		if (arr[target] == target)
			return target;
		return arr[target] = find(arr, arr[target]);
	}

	static public void union(int[] arr, int x, int y) {
		int a = find(arr, x);
		int b = find(arr, y);

		if (a < b) arr[b] = a;
		else arr[a] = b;
	}


}
