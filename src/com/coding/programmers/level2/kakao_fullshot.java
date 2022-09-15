package com.coding.programmers.level2;

public class kakao_fullshot {

    public static void full_search_sosu(String[] args) {
        kakao_fullshot main = new kakao_fullshot();
        main.solution(2, new String[]{"N~F=0", "R~T>2"});
    }

    String[] player = {"A", "C", "F", "J", "M", "N", "R", "T"};
    String[] item;
    int answer = 0;

    public int solution(int n, String[] data) {
        boolean[] visit = new boolean[8];
        item = data;
        dfs("", visit);
        return answer;
    }

    public void dfs(String name, boolean[] visit) {

        if (name.length() == 8) {
            if (check(name)) {
                answer++;
            }
            return;
        }

        for (int i = 0; i < player.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                String sb = name + player[i];
                dfs(sb, visit);
                visit[i] = false;
            }
        }
    }

    public boolean check(String sb) {
        boolean isChk = true;
        for (int i = 0; i < item.length; i++) {
            int a = sb.indexOf(item[i].charAt(0));
            int b = sb.indexOf(item[i].charAt(2));

            char op = item[i].charAt(3);

            int diff = Integer.parseInt(String.valueOf(item[i].charAt(4)));

            if (String.valueOf(op).equals("=")) {
                if (!(Math.abs(a - b) == diff+1)) {
                    isChk = false;
                    break;
                }
            } else if (String.valueOf(op).equals(">")) {
                if (Math.abs(a - b) <= diff+1) {
                    isChk = false;
                    break;
                }
            } else {
                if (Math.abs(a - b) >= diff+1) {
                    isChk = false;
                    break;
                }
            }
        }

        return isChk;
    }
}
