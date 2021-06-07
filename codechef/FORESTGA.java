package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 26-10-2020, Monday
 **/
public class FORESTGA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] h = new int[n], r = new int[n];
        int amount;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            h[i] = Integer.parseInt(st.nextToken());
            r[i] = Integer.parseInt(st.nextToken());
        }

        for (int t = 0;; t++) {
            amount = 0;
            for (int i = 0; i < n; i++) {
                h[i] += r[i];
                if (h[i] >= l) {
                    amount += h[i];
                }
            }
            if (amount >= w) {
                pw.println(t);
                break;
            }
        }



        pw.flush();
        pw.close();
        br.close();
    }
}