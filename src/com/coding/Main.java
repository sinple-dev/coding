package com.coding;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        main.solution(2, new String[]{"N~F=0", "R~T>2"});
    }



//    public int[] solution(int[][] data) {
//
//        Queue<int[]> queue = new LinkedList<>();
//
//        int[] answer = new int[data.length];
//        int time = 0;
//
//
//        for (int i = 0; i < data.length; i++) {
//            int[] print = data[i];
//
//            while(true) {
//
//                if(queue.isEmpty()) {
//                    queue.add(print);
//                    time += print[1];
//                    answer[i] = i;
//                    break;
//                } else {
//
//                    queue.poll();
//                }
//
//            }
//
//        }
//
//
//        return answer;
//
//    }

}

