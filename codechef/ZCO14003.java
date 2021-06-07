package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Author : Arihant Bansal
 * Date : 01-11-2020, Sunday
 **/
public class ZCO14003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());
        long[] budgets = new long[n];
        for (int i = 0; i < n; i++) {
            budgets[i] = Long.parseLong(br.readLine().trim());
        }

        Arrays.sort(budgets);
        long rev, maxRev = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            rev = budgets[i] * (n - i);
            maxRev = Math.max(maxRev, rev);
        }

        pw.println(maxRev);

        pw.flush();
        pw.close();
        br.close();
    }
}