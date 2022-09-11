package com.coding.programmers;

import java.io.IOException;

public class practice_digit {

    public static void main(String[] args) throws IOException {
        practice_digit main = new practice_digit();
//        System.out.println(
//                main.solution(new String[]{"mislav", "stanko", "mislav", "ana", "aba"}, new String[]{"stanko", "ana", "mislav"})
//        );
        System.out.println(
                main.solution(10)
        );
    }

    public int solution(int n) {
        int answer = 0;
        String txt = String.valueOf(n);
        for (int i = 0; i < txt.length(); i++) {
            answer += Integer.parseInt(txt.substring(i, i + 1));
        }
        return answer;
    }

}



