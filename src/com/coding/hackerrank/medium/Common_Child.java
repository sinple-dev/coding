package com.coding.hackerrank.medium;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Common_Child {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String s1 = bufferedReader.readLine();

		String s2 = bufferedReader.readLine();

		int result = Result16.commonChild(s1, s2);

		System.out.println(result);

		bufferedReader.close();
	}
}

class Result16 {
	public static int commonChild(String s1, String s2) {
		// Write your code here

		int[][] dp = new int[s1.length() + 1][s2.length() + 1];


		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					dp[i+1][j+1] = dp[i][j] + 1;
				} else {
					dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}

		return dp[s1.length()][s2.length()];

	}
}
