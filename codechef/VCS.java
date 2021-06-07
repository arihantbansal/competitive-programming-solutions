package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 15-10-2020, Thursday
 **/

public class VCS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, m, k, curr, both, none, ai, bi;
        int[] a, b;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            both = 0;
            none = 0;

            a = new int[n];
            b = new int[n];

            st = new StringTokenizer(br.readLine().trim(), " ");

            for (int j = 0; j < m; j++) {
                curr = Integer.parseInt(st.nextToken());
                a[curr - 1]++;
            }

            st = new StringTokenizer(br.readLine().trim(), " ");

            for (int j = 0; j < k; j++) {
                curr = Integer.parseInt(st.nextToken());
                b[curr - 1]++;
            }

            for (int j = 0; j < n; j++) {
                ai = a[j];
                bi = b[j];

                if (ai == 0 && bi == 0) {
                    none++;
                } else if (ai == 1 && bi == 1) {
                    both++;
                }
            }
            pw.printf("%d %d%n", both, none);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}