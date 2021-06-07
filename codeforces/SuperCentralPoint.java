package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 29-10-2020, Thursday
 **/
public class SuperCentralPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        Pair[]  points = new Pair[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            points[i] = new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int x, y, cX, cY, left, right, upper, lower, scp = 0;
        for (int i = 0; i < n; i++) {
            x = points[i].x;
            y = points[i].y;

            left = 0;
            right = 0;
            upper = 0;
            lower = 0;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                cX = points[j].x;
                cY = points[j].y;

                if (y == cY) {
                    if (cX > x) right++;
                    else if (cX < x) left++;
                } else if (x == cX) {
                    if (cY > y) upper++;
                    else if (cY < y) lower++;
                }
            }

            if(left > 0 && right > 0 && upper > 0 && lower > 0) scp++;
        }

        pw.println(scp);

        pw.flush();
        pw.close();
        br.close();
    }

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}