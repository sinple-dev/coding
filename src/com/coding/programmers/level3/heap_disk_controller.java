package com.coding.programmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class heap_disk_controller {

    public static void main(String[] args) {
        heap_disk_controller main = new heap_disk_controller();

        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(main.solution(jobs));


    }

    public int solution(int[][] jobs) {

        int answer = 0;
        int end = 0; // 수행되고난 직후의 시간
        int jobsIdx = 0; // jobs 배열의 인덱스
        int count = 0; // 수행된 요청 갯수

        // 원본 배열 오름차순 정렬 (요청시간 오름차순)
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

        // 처리 시간 오름차순으로 정렬되는 우선순위 큐(Heap)
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        while (count < jobs.length) {
            while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= end) {
                pq.add(jobs[jobsIdx++]);
            }

            if (pq.isEmpty()) {
                end = jobs[jobsIdx][0];
            } else {
                int[] temp = pq.poll();
                answer += temp[1] + end - temp[0];
                end += temp[1];
                count++;
            }
        }

        return (int) Math.floor(answer / jobs.length);

    }
}
