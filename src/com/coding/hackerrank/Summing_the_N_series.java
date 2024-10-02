package com.coding.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

class Summing_the_N_series {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, t).forEach(tItr -> {
			try {
				long n = Long.parseLong(bufferedReader.readLine().trim());

				long result = Result.summingSeries(n);
				System.out.println(result);

			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
	}
}


class Result {

	/*
	 * Complete the 'summingSeries' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts LONG_INTEGER n as parameter.
	 */

	static final int MODULUS = 1000000007;
	public static long summingSeries(long n) {
		// Write your code here


		n %= MODULUS;
		return (int) (n * n % MODULUS);

	}

}