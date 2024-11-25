package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1012_ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());



        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            boolean[][] visit = new boolean[a][b];
            int[][] farm = new int[a][b];
            // ArrayList<xy> arr = new ArrayList<>();


            int aa = 0;
            int bb = 0;
            for (int j = 0; j < c; j++) {
                st = new StringTokenizer(br.readLine());
                aa = Integer.parseInt(st.nextToken());
                bb = Integer.parseInt(st.nextToken());
                farm[aa][bb] = 1;

            }

            int count = 0;
			for (int f = 0; f < farm.length; f++) {
                for (int d = 0; d < farm[f].length; d++) {
                    if (!visit[f][d] && farm[f][d] == 1) {
                        Queue<int[]> q = new LinkedList<>();
                        q.add(new int[]{f, d});
                        visit[f][d] = true;

                        while (!q.isEmpty()) {
                            int[] current = q.poll();

                            for (int k = 0; k < 4; k++) {
                                int x = current[0] + dx[k];
                                int y = current[1] + dy[k];

                                if (x >= 0 && y >= 0 && y < farm[0].length && x < farm.length && !visit[x][y] && farm[x][y] == 1) {
                                    q.add(new int[] {x, y});
                                    count++;
                                }
                            }

                        }
                    }
                }
			}

            System.out.println(count);


        }

    }

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {-1, 1, 0, 0};

    static class xy {
        int x;
        int y;

        public xy(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
