package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 15-10-2020, Thursday
 **/
public class ATM2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, k, a;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());

            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                a = Integer.parseInt(st.nextToken());
                if(k - a >= 0) {
                    pw.print("1");
                    k -= a;
                } else {
                    pw.print("0");
                }
            }
            pw.println();
        }


        pw.flush();
        pw.close();
        br.close();
    }
}