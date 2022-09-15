package com.coding.programmers.level1;

import java.io.IOException;

public class practice_evenodd {

    public static void main(String[] args) throws IOException {
        practice_evenodd main = new practice_evenodd();
//        System.out.println(
//                main.solution(new String[]{"mislav", "stanko", "mislav", "ana", "aba"}, new String[]{"stanko", "ana", "mislav"})
//        );
        System.out.println(
                main.solution(10)
        );
    }

    public String solution(int num) {
        if (num % 2 == 0) return "Even";
        else return "Odd";
    }
}



