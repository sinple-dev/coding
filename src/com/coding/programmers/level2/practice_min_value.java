package com.coding.programmers.level2;

import java.io.IOException;
import java.util.Arrays;

public class practice_min_value {

    public static void main(String[] args) throws IOException {
        practice_min_value main = new practice_min_value();
        System.out.println(
                main.solution(new int[]{1, 2}, new int[]{3, 4})
        );

    }

    public int solution(int[] A, int[] B) {

        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++) {

            answer=answer+(A[i]*B[A.length-i-1]);

        }
        System.out.println(answer);

        return answer;
    }


}



