package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 24-10-2020, Saturday
 **/
public class PerfectPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());

        if (n % 2 != 0) {
            pw.println(-1);
        } else {
            for (int i = 1; i <= n; i++) {
                if(i % 2 == 0) {
                    pw.printf("%d ", (i - 1));
                } else {
                    pw.printf("%d ", (i + 1));
                }
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}