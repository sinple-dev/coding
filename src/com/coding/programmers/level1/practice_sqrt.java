package com.coding.programmers.level1;

import java.io.IOException;

public class practice_sqrt {

    public static void main(String[] args) throws IOException {
        practice_sqrt main = new practice_sqrt();
//        System.out.println(
//                main.solution(new String[]{"mislav", "stanko", "mislav", "ana", "aba"}, new String[]{"stanko", "ana", "mislav"})
//        );
        System.out.println(
                main.solution(10)
        );
    }

    public long solution(long n) {
        double x = Math.sqrt(n);
        if (x == (int) x) return (long) Math.pow(x+1, 2);
        else return -1;

    }

}



