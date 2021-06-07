package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 14-10-2020, Wednesday
 **/
public class FLOW009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());
        int q, p;
        double exp = 0;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());

            q = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());

            if(q > 1000) {
                exp = q * (0.9) * p;
            } else {
                exp = q * p;
            }

            pw.printf("%.6f%n", exp);

        }

        pw.flush();
        pw.close();
        br.close();
    }
}