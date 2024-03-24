package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10872_factorial {

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            System.out.println(factorial(num));
        }

        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            }
            return n * factorial(n-1);
        }

    }
}
