package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 17-10-2020, Saturday
 **/
public class CNOTE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int x, y, k, n, p, c, left;
        boolean luck;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            left = x - y;
            luck = false;

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine().trim());
                p = Integer.parseInt(st.nextToken());
                c = Integer.parseInt(st.nextToken());

                if(c > k) { continue; }
                if(left <= p) {
                    luck = true;
                }
            }
            pw.println(luck ? "LuckyChef" : "UnluckyChef");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}