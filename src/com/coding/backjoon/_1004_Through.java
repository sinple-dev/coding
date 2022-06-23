package com.coding.backjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class _1004_Through {

    public static void through() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner in = new Scanner(System.in);

        int cnt = in.nextInt();

        while (0 < cnt--) {

            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();

            int planet = in.nextInt();
            int through = 0;

            for(int i = 0; i < planet; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int r = in.nextInt();

                boolean one = isThrough(x1, y1, x, y, r);
                boolean two = isThrough(x2, y2, x, y, r);

                if (one != two) {
                    through++;
                }
            }

            bw.write(through + "\n");
        }
        bw.flush();
    }

    static boolean isThrough(int x1, int y1, int x, int y, int r) {
        if (Math.pow(x - x1, 2) + Math.pow(y - y1, 2) < Math.pow(r, 2)) {
            return true;
        }else {
            return false;
        }
    }
}
