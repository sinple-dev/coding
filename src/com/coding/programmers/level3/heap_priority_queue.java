package com.coding.programmers.level3;

import java.util.PriorityQueue;

public class heap_priority_queue {

    public static void main(String[] args) {
        heap_priority_queue main = new heap_priority_queue();
        String[] operations = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        System.out.println(main.solution(operations));
    }

    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (String operation : operations) {
            String[] split = operation.split(" ");
            String op = split[0];
            int num = Integer.parseInt(split[1]);

            switch (op) {
                case "I":
                    minHeap.add(num);
                    maxHeap.add(num);
                    break;
                case "D":
                    if (minHeap.isEmpty()) {
                        break;
                    }
                    if (num == 1) {
                        int max = maxHeap.poll();
                        minHeap.remove(max);
                    }
                    if (num == -1) {
                        int min = minHeap.poll();
                        maxHeap.remove(min);
                    }
            }
        }

        if (maxHeap.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{maxHeap.poll(), minHeap.poll()};
    }

}
