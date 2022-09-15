package com.coding.programmers.level1;

import java.io.IOException;

public class practice_stringtoint {

    public static void main(String[] args) throws IOException {
        practice_stringtoint main = new practice_stringtoint();
        System.out.println(
                main.solution("1234")
        );
    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }


}



