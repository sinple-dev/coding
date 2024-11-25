package com.coding.programmers.level3;

import java.util.*;
import java.util.stream.Collectors;

public class graph_long_node {



    //
    // public static void main(String[] args) {
    //     graph_long_node main = new graph_long_node();
    //     System.out.println(main.solution(new int[]{2,5,3,8,1}, 3, 11));
    // }
    //
    // public int solution(int[] arr, int k, int t) {
    //
    //     total = t;
    //     count = k;
    //     array = arr;
    //     dfs(0, 0, 0);
    //
    //     return answer;
    // }
    //
    // int[] array;
    // int answer = 0;
    // boolean[] visit;
    // int total;
    // int count;
    //
    // public void dfs(int index, int sum, int selectCount) {
    //     if (sum > total) {
    //         return;
    //     }
    //
    //     if (index == array.length) {
    //         if (selectCount >= count && sum <= total) {
    //             answer++;
    //         }
    //         return;
    //     }
    //
    //     dfs(index + 1, sum, selectCount);
    //     dfs(index + 1, sum + array[index], selectCount + 1);
    //
    // }




    public static void main(String[] args) {
        graph_long_node main = new graph_long_node();

        // String[] costs = {"alex pizza pasta", "alex pizza pizza", "alex noodle", "bob pasta", "bob noodle sandwich pasta", "bob steak noodle"};
        // System.out.println(main.solution(costs));



        Map<String, List<String>> result = new HashMap<>();

        result.put("test", new ArrayList<>());
        result.put("test1", new ArrayList<>());

        System.out.println("1");




    }

    public String[] solution(String[] orders) {

        List<String> list = new ArrayList<>();

        Map<String, List<String>> result = new HashMap<>();


        int max = 0;

        for (String order : orders) {
            String[] split = order.split(" ");

            result.putIfAbsent(split[0], new ArrayList<>());

            String[] as = Arrays.copyOfRange(split, 1, split.length);

            result.get(split[0]).addAll(List.of(as));
            max = Math.max(max, result.get(split[0]).size());
        }




        // for (Map.Entry<String, Set<String>> entry : result.entrySet()) {
        //     if (entry.getValue().size() > max) {
        //         max = entry.getValue().size();
        //     }
        // }
        //
        // for (Map.Entry<String, Set<String>> entry : result.entrySet()) {
        //     if(entry.getValue().size() == max) {
        //         list.add(entry.getKey());
        //     }
        // }

        list.stream().sorted();
        return list.toArray(new String[0]);

    }




    // public static void main(String[] args) {
    //     graph_long_node main = new graph_long_node();
    //
    //     int[][] costs = {{3,6}, {4, 3}, {3,2}, {1,3}, {1,2}, {2,4}, {5,2}};
    //     System.out.println(main.solution(6, costs));
    //
    //
    // }
    //
    //
    // public int solution(int n, int[][] edge) {
    //
    //     int answer = 0;
    //
    //     ArrayList<Integer>[] list = new ArrayList[n+1];
    //     for (int i=1; i<=n; i++) {
    //         list[i] = new ArrayList<>();
    //     }
    //
    //     for (int i=0; i<edge.length; i++) {
    //         list[edge[i][0]].add(edge[i][1]);
    //         list[edge[i][1]].add(edge[i][0]);
    //     }
    //
    //
    //     int[] distance = new int[n+1];
    //     boolean[] visited = new boolean[n+1];
    //
    //     Queue<Integer> q = new LinkedList<>();
    //     q.add(1);
    //
    //     while(!q.isEmpty()) {
    //         int current = q.poll();
    //         visited[current] = true;
    //
    //         for (int a : list[current]) {
    //             if (!visited[a]) {
    //                 visited[a] = true;
    //                 distance[a] = distance[current] + 1;
    //                 q.add(a);
    //             }
    //         }
    //     }
    //
    //     int maxDistance = Arrays.stream(distance).max().getAsInt();
    //
    //     long count = Arrays.stream(distance).filter(d -> d == maxDistance).count();
    //
    //     return (int) count;
    //
    // }

}
