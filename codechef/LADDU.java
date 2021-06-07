package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 01-11-2020, Sunday
 **/
public class LADDU {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        int n, origin, laddus, det;
        String activity;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            origin = (st.nextToken().equals("INDIAN")) ? 1 : 0;
            laddus = 0;

            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine().trim());
                activity = st.nextToken().trim();
                switch (activity) {
                    case "CONTEST_WON":
                        det = Integer.parseInt(st.nextToken());
                        laddus += (300 + ((det > 20) ? 0 : (20 - det)));
                        break;
                    case "TOP_CONTRIBUTOR":
                        laddus += 300;
                        break;
                    case "BUG_FOUND":
                        det = Integer.parseInt(st.nextToken());
                        laddus += det;
                        break;
                    case "CONTEST_HOSTED":
                        laddus += 50;
                        break;
                }
            }
            pw.println((origin == 0 ? (laddus / 400) : (laddus / 200)));
        }

        pw.flush();
        pw.close();
        br.close();
    }
}