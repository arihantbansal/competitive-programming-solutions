package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 26-10-2020, Monday
 **/
public class LECANDY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, c, count;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine().trim());
            count = 0;
            for (int j = 0; j < n; j++) {
                count += Integer.parseInt(st.nextToken());
            }

            pw.println((count <= c) ? "Yes" : "No");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}