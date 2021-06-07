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
public class RPD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, max, sum;
        int[] a;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            a = new int[n];
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
            }

            max = 0;
            for (int j = 0; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    sum = sumDigits(a[j] * a[k]);
                    max = Math.max(max, sum);
                }
            }

            pw.println(max);
        }


        pw.flush();
        pw.close();
        br.close();
    }

    public static int sumDigits(int i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }
}