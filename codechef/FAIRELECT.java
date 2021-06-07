package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 01-01-2021, Friday
 **/
public class FAIRELECT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, m, a[], b[], swaps;
        long sumA, sumB;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            a = new int[n];
            b = new int[m];
            sumA = 0;
            sumB = 0;

            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
                sumA += a[j];
            }

            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < m; j++) {
                b[j] = Integer.parseInt(st.nextToken());
                sumB += b[j];
            }

            Arrays.sort(a);
            Arrays.sort(b);

            swaps = 0;
            for (int j = 0, min = Math.min(m, n); j < min; j++) {
                if (sumA > sumB) break;
                sumA += (b[m - j - 1] - a[j]);
                sumB += (a[j] - b[m - j - 1]);
                swaps += 1;
            }

            if (sumA <= sumB) swaps = -1;

            pw.println(swaps);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}