package com.coding.hackerrank.easy;

import static java.util.stream.Collectors.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Extra_Long_Factorials {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		Result3.extraLongFactorials(n);

		bufferedReader.close();
	}
}

class Result3 {

	static BigInteger sum = BigInteger.valueOf(1);
	public static void extraLongFactorials(int n) {
		// Write your code here
		if (n == 1) {
			System.out.println(sum);
			return;
		}
		sum = sum.multiply(BigInteger.valueOf(n));
		extraLongFactorials(n-1);

	}

}