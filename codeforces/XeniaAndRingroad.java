package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 20-11-2020, Friday
 **/
public class XeniaAndRingroad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine().trim());
        int[] tasks = new int[m];
        long cost = 0;
        for (int i = 0; i < m; i++) {
            tasks[i] = Integer.parseInt(st.nextToken());
            if (i == 0) {
                cost = tasks[0] - 1;
            } else {
                if (tasks[i] >= tasks[i - 1]) {
                    cost += tasks[i] - tasks[i - 1];
                } else {
                    cost += tasks[i] + (n - tasks[i - 1]);
                }
            }
        }

        pw.println(cost);

        pw.flush();
        pw.close();
        br.close();
    }
}