package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 16-01-2021, Saturday
 **/
public class ADADISH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());
        int n, sum, time;
        int[] c;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            c = new int[n];
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                c[j] = Integer.parseInt(st.nextToken());
            }

            sum = 0;
            for (int j : c)
                sum += i;

            time = sum;
            for (int x : c) {
                time = Math.min(time, Math.max(x, sum - x));
            }

            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = c[j] + c[k];
                    time = Math.min(time, Math.max(x, sum - x));
                }
            }

            pw.println(time);

        }

        pw.flush();
        pw.close();
        br.close();
    }
}