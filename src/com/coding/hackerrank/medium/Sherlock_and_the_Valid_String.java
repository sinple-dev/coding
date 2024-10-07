package com.coding.hackerrank.medium;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Sherlock_and_the_Valid_String {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String s = bufferedReader.readLine();

		String result = Result11.isValid(s);

		System.out.println(result);

		bufferedReader.close();
	}
}

class Result11 {

	public static String isValid(String s) {
		// Write your code here


		// 2개 이상인게 2개 이상이면 no
		// 2개 이상인게 1개면 yes
		// 모두 개수 같으면 yes
		// 1개 제거할수 있으니까 개수해서 개수 모두 맞추면 yes

		String[] arr = s.split("");

		int[] cnt = new int[26];

		for (int i = 0; i < arr.length; i++) {
			cnt[arr[i].charAt(0) - 97]++;
		}

		Arrays.sort(cnt);
		int[] cnt2 = Arrays.stream(cnt).filter(i -> i > 0).toArray();

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int j : cnt2) {
			map.put(j, map.getOrDefault(j, 0) + 1);
		}

		if (map.size() == 2 && map.get(cnt2[cnt2.length - 1]) == 1) return "YES";

		if (cnt2.length == 1) return "YES";
		if (cnt2.length == 2 && cnt2[0] == 1) return "YES";
		if (cnt2.length == 2 && cnt2[1] - cnt2[0] == 1) return "YES";


		// 이건 조건 찾는게 너무 어렵다 빡씨다..
		// 이건 조건 찾는게 너무 어렵다 빡씨다..
		// 이건 조건 찾는게 너무 어렵다 빡씨다..
		// 이건 조건 찾는게 너무 어렵다 빡씨다..
		return "NO";

	}
}

