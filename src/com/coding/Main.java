package com.coding;

import java.io.IOException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main();

        int[][] wires = {{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};

        main.solution(9, wires);

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

