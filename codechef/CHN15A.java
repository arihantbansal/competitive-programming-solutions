package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 27-10-2020, Tuesday
 **/
public class CHN15A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, k, value, count;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            value = 0;
            count = 0;

            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                value = Integer.parseInt(st.nextToken()) + k;
                if (value % 7 == 0) count++;
            }

            pw.println(count);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}