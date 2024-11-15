package com.coding.programmers.level3;


import java.util.Arrays;

public class dp_triangle {


    public static void main(String[] args) {


        String startDay = "FRI";
        String[] daysOfWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        for (int i = 0; i < 30; i++) {
            int dayIndex = (Arrays.asList(daysOfWeek).indexOf(startDay) + i) % 7;
            String day = daysOfWeek[dayIndex];

            System.out.println(day);

        }








        // dp_triangle main = new dp_triangle();
        // int[][] numbers = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        //
        // System.out.println(main.solution(numbers));

    }



    public int solution(int[][] triangle) {


        int[][] dp = new int[triangle.length][triangle.length];

        dp[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {

                if (j == 0) {
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                } else if (j == triangle[i].length-1) {
                    dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                } else {
                    int a = dp[i-1][j] + triangle[i][j];
                    int b = dp[i-1][j-1] + triangle[i][j];

                    dp[i][j] = Math.max(a, b);
                }

            }

        }

        int[] arr = dp[triangle.length-1];
        Arrays.sort(arr);

        return arr[arr.length-1];

    }

}
