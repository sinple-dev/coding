package com.coding.programmers.level1;

import java.io.IOException;
import java.util.Arrays;

public class practice_average {

    public static void main(String[] args) throws IOException {
        practice_average main = new practice_average();
        System.out.println(
                main.solution(new int[]{1, 2, 3, 4})
        );
    }

    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

}



