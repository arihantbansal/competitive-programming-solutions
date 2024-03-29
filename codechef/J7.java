package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 12-09-2021, Sunday
 **/
public class J7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            int p = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());

            double l = (p - Math.sqrt(Math.pow(p, 2) - (24.0 * s))) / 12.0;
            double h = (p / 4.0) - (2.0 * l);

            double volume = Math.pow(l, 2) * h;
            pw.println(String.format("%.2f", volume));
        }


        pw.flush();
        pw.close();
        br.close();
    }
}