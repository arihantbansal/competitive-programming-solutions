package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 09-10-2020, Friday
 **/
public class YoungPhysicist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] x = new int[n], y = new int[n], z = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
            z[i] = Integer.parseInt(st.nextToken());
        }

        pw.println((sum(x) == 0) && (sum(y) == 0) && (sum(z) == 0) ? "YES" : "NO");

        pw.flush();
        pw.close();
        br.close();
    }

    public static int sum(int[] coord) {
        int sum = 0;
        for (int i = 0; i < coord.length; i++) {
            sum += coord[i];
        }
        return sum;
    }
}