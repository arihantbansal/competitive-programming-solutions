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
public class KTTABLE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, req, count;
        int[] finish;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());

            finish = new int[n + 1];
            finish[0] = 0;
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 1; j <= n; j++) {
                finish[j] = Integer.parseInt(st.nextToken());
            }

            count = 0;
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 1; j <= n; j++) {
                req = Integer.parseInt(st.nextToken());
                if (req <= (finish[j] - finish[j - 1])) { count++; }
            }

            pw.println(count);
        }
        

        pw.flush();
        pw.close();
        br.close();
    }
}