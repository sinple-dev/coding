package com.coding.programmers.level2;

import java.io.IOException;

public class challenge_binary {

    public static void main(String[] args) throws IOException {
        challenge_binary main = new challenge_binary();
        System.out.println(
                main.solution("110010101001")
        );
    }

    public int[] solution(String s) {
        int cnt = 0;
        int remove = 0;

        while (!s.equals("1")) {
            remove += cntZero(s);
            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());
            cnt++;
        }

        return new int[]{cnt, remove};
    }

    private int cntZero(String c) {
        int cnt = 0;
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == 48) cnt++;
        }
        return cnt;
    }

}



