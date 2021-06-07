package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 19-12-2020, Saturday
 **/
public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        long y, x, z, ans;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            y = Long.parseLong(st.nextToken());
            x = Long.parseLong(st.nextToken());

            if (x > y) {
                if (x % 2 == 0) {
                    --x;
                    ans = x * x + y;
                } else {
                    ans = x * x - y + 1;
                }
            } else {
                if (y % 2 == 0) {
                    ans = y * y - x + 1;
                } else {
                    --y;
                    ans = y * y + x;
                }
            }

            pw.println(ans);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}