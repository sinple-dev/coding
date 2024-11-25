package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


class Edge3 implements Comparable<Edge3> {

	int start;
	int end;
	int weight;

	public Edge3(int start, int end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge3 o) {
		return this.weight - o.weight;
	}

}


public class _6497_ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Edge3> edges = new ArrayList<>();

		int cost = 0;
		int weight = 0;
		int n =0;
		int m =0;

		int[] parent = new int[n+1];

		StringTokenizer st;
		while(true) {

			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			if(n == 0 && m == 0)
				break;

			parent = new int[n+1];
			for (int i = 0; i < n; i++) {
				parent[i] = i;
			}
			for(int i = 0 ; i < m ; i++){
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				weight = Integer.parseInt(st.nextToken());
				edges.add(new Edge3(x,y,weight));
				cost += weight;
			}
		}

		Collections.sort(edges, (o1, o2) -> o1.weight - o2.weight);
		int answer = 0;

		for (Edge3 edge : edges) {
			if (find(parent, edge.start) != find(parent, edge.end)) {
				union(parent, edge.start, edge.end);
				answer += edge.weight;
			}
		}

		System.out.println(cost - answer);

	}

	public static int find(int[] arr, int target) {
		if (arr[target] == target) {
			return target;
		}
		return arr[target] = find(arr, arr[target]);
	}

	public static void union(int[] arr, int x, int y) {
		int a = find(arr, x);
		int b = find(arr, y);

		if (a < b) arr[b] = arr[a];
		else arr[a] = arr[b];
	}


}
