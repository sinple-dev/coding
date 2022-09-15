package com.coding.programmers.level1;

import java.io.IOException;
import java.util.Arrays;

public class practice_maxmin {

    public static void main(String[] args) throws IOException {
        practice_maxmin main = new practice_maxmin();
        System.out.println(
                main.solution("1 2 3 4")
        );
    }

    public String solution(String s) {
        String[] arr = s.split(" ");
        Long[] ar = Arrays.stream(arr).mapToLong(Long::parseLong).boxed().toArray(Long[]::new);
        Arrays.sort(ar);
        return ar[0] + " " + ar[ar.length - 1];
    }

}



