package com.coding.programmers.level1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class practice_descending {

    public static void main(String[] args) throws IOException {
        practice_descending main = new practice_descending();
        System.out.println(
                main.solution(118372)
        );
    }

    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return Long.parseLong(Arrays.stream(arr).collect(Collectors.joining()));
    }

}



