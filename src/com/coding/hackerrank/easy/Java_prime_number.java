package com.coding.hackerrank.easy;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Java_prime_number {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(in));

		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		int n4 = Integer.parseInt(br.readLine());
		int n5 = Integer.parseInt(br.readLine());

		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);

	}
}

class Prime {

	public void checkPrime(int... numbers) {
		for (int i : numbers) {
			if (isPrime(i)) {
				out.print(i + " ");
			}
		}
		out.println();
	}

	public boolean isPrime(int i) {
		if (i < 2) return false;
		if (i < 4) return true;
		if (i % 2 == 0 || i % 3 == 0) return false;
		for (int j = 5; j * j <= i; j += 6) {
			if (i % j == 0 || i % (j + 2) == 0) return false;
		}
		return true;
	}


}