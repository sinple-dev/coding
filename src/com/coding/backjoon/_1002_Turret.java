package com.coding.backjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _1002_Turret {

    public static void Turret() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();

        while (0 < cnt--) {
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int r1 = in.nextInt();

            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int r2 = in.nextInt();
            bw.write(turret(x1, y1, r1, x2, y2, r2) + "\n");
        }
        bw.flush();
    }

    public static int turret(int x1, int y1, int r1, int x2, int y2, int r2) {

        int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        // 원이 밖에서 안만나는 경우
        else if (distance > Math.pow(r1 + r2, 2)) {
            return 0;
        }
        // 원이 안에서 서로 안만나는 경우
        else if (distance < Math.pow(r2 - r1, 2)) {
            return 0;
        }
        //      원이 밖에 있는 경우
        else if (distance == Math.pow(r1 + r2, 2)) {
            return 1;
        }
        else if (distance == Math.pow(r2 - r1, 2)) {
            return 1;
        }
        else {
            return 2;
        }
    }

}
