package com.coding.programmers;

import java.io.IOException;

public class practice_hashard {

    public static void main(String[] args) throws IOException {
        practice_hashard main = new practice_hashard();
        System.out.println(
                main.solution(18)
        );
    }

    public boolean solution(int x) {
        String txt = String.valueOf(x);
        int sum = 0;
        for (int i = 0; i < txt.length(); i++) {
            sum += Integer.parseInt(txt.substring(i, i + 1));
        }
        return x % sum == 0 ? true : false;
    }
}



