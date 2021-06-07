package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 20-12-2020, Sunday
 **/
public class TwoSeals {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

        int[] x = new int[n], y = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0, area;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                area = x[i] * y[i] + x[j] * y[j];
                if (x[i] + x[j] <= a && Math.max(y[i], y[j]) <= b
                    || x[i] + y[j] <= a && Math.max(y[i], x[j]) <= b
                    || y[i] + x[j] <= a && Math.max(x[i], y[j]) <= b
                    || y[i] + y[j] <= a && Math.max(x[i], x[j]) <= b
                    || x[i] + x[j] <= b && Math.max(y[i], y[j]) <= a
                    || x[i] + y[j] <= b && Math.max(y[i], x[j]) <= a
                    || y[i] + x[j] <= b && Math.max(x[i], y[j]) <= a
                    || y[i] + y[j] <= b && Math.max(x[i], x[j]) <= a) {
                    max = Math.max(max, area);
                }
            }
        }

        pw.println(max);

        pw.flush();
        pw.close();
        br.close();
    }
}