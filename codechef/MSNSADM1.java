package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author : Arihant Bansal
 * Date : 12-09-2021
 **/

public class MSNSADM1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().trim());

            int[] a = new int[n], b = new int[n];
            int max = 0, score;
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                b[j] = Integer.parseInt(st.nextToken());
                score = 20 * a[j] - 10 * b[j];
                max = Math.max(score, max);
            }
            pw.println(max);
        }


        pw.flush();
        pw.close();
        br.close();
    }
}