package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _15650_nm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        arr = new int[m];
        visit = new boolean[n+1];

        dfs(n, m, 0);

        for(String s : set) {
            System.out.println(s);
        }
    }

    static Set<String> set = new LinkedHashSet<>();
    static int[] arr;
    static boolean[] visit;
    static String  str = "";

    private static void dfs(int n, int m, int d) {
        if(d == m) {
            int[] tmp = arr.clone();
            Arrays.sort(tmp);
            str = "";
            for(int a : tmp) {
                str += a + " ";
            }
            set.add(str);
            return;
        }

        for(int i = 1; i <= n; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[d] = i;
                dfs(n, m, d+1);
                visit[i] = false;
            }
        }
    }
}
