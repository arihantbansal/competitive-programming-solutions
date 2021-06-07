package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 05-11-2020, Thursday
 **/
public class EOOPR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        long x, y, diff;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            x = Long.parseLong(st.nextToken());
            y = Long.parseLong(st.nextToken());

            diff = y - x;
            if (diff > 0) {
                if (diff % 2 == 1) pw.println(1);
                else if (diff % 4 != 0) pw.println(2);
                else pw.println(3);
            } else if (diff < 0) {
                if ((-diff) % 2 == 1) pw.println(2);
                else pw.println(1);
            } else {
                pw.println(0);
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}