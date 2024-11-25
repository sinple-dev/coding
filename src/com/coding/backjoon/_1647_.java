package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;


class Edge2 implements Comparable<Edge2> {

	int start;
	int end;
	int weight;

	public Edge2(int start, int end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}


	@Override
	public int compareTo(Edge2 o) {
		return this.weight - o.weight;
	}
}


public class _1647_ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st1.nextToken());

		int m = Integer.parseInt(st1.nextToken());

		int[] parent = new int[n+1];
		ArrayList<Edge2> edges = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());

			edges.add(new Edge2(start, end, weight));
		}

		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}

		Collections.sort(edges, (o1, o2) -> o1.weight - o2.weight);
		int answer = 0;
		int max = 0;
		for (int i =0; i < m; i++) {
			if (find(parent, edges.get(i).start) != find(parent, edges.get(i).end)) {
				union(parent, edges.get(i).start, edges.get(i).end);
				answer += edges.get(i).weight;
				max = Math.max(max, edges.get(i).weight);
			}
		}

		System.out.println(answer - max);

	}

	public static int find(int[] arr, int index) {
		if (arr[index] == index) {
			return index;
		}
		return arr[index] = find(arr, arr[index]);
	}

	public static void union(int[] arr, int x, int y) {
		int a = find(arr, x);
		int b = find(arr, y);

		if (a < b) arr[b] = arr[a];
		else arr[a] = arr[b];
	}

}
