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
public class CONFLIP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int g, i, n, q;

        for (int j = 0; j < t; j++) {
            g = Integer.parseInt(br.readLine().trim());
            for (int k = 0; k < g; k++) {
                st = new StringTokenizer(br.readLine().trim());
                i = Integer.parseInt(st.nextToken());
                n = Integer.parseInt(st.nextToken());
                q = Integer.parseInt(st.nextToken());

                if (n % 2 == 0) {
                    pw.println((int) Math.floor(n / 2));
                } else {
                    pw.println((i == q) ? ((int) Math.floor(n / 2)) : ((int) Math.floor(n / 2) + 1));
                }
            }
        }
        
        pw.flush();
        pw.close();
        br.close();
    }
}