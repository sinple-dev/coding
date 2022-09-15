package com.coding.programmers.level2;


import java.util.HashSet;

public class full_search_sosu {

    public static void full_search_sosu(String[] args) {
        full_search_sosu main = new full_search_sosu();
        main.solution("011");
    }

    boolean[] visited;
    HashSet<Integer> map;

    public int solution(String numbers) {

        visited = new boolean[numbers.length()];
        map = new HashSet<>();

        backTracking(0, numbers, "");

        return map.size();
    }


    public void backTracking(int depth, String numbers, String current) {
        if (depth == numbers.length()) {
            return;
        }

        for (int i=0; i< numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;

                String tmp = current + numbers.charAt(i);

                if (chk(Integer.parseInt(tmp))) {
                    map.add(Integer.parseInt(tmp));
                }

                backTracking(depth+1, numbers, tmp);
                visited[i] = false;

            }

        }

    }
    public boolean chk(int n) {
        for (int i = 2; i <= n; i++) {
            if (i != n && n % i == 0)
                return false;
        }

        if (n <= 1) return false;
        return true;
    }

}
