package com.coding.programmers.level2;



public class practice_124world {

    public static void practice_124world(String[] args) {

        practice_124world main = new practice_124world();

        System.out.println(main.solution(20));

    }

    public String solution(int n) {
        String answer = "";

        String[] numbers = {"4", "1", "2"};

        while(n > 0) {

            int rest = n % 3;
            n = n / 3;

            if (rest == 0) n--;
            answer = numbers[rest] + answer;
        }


        return answer;

    }


}
