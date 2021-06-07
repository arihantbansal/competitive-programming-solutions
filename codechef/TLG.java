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
public class TLG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        int p1 = 0, p2 = 0, lead = 0, leader = 1, curr;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            p1 += Integer.parseInt(st.nextToken());
            p2 += Integer.parseInt(st.nextToken());
            curr = p1 - p2;
            if(Math.abs(curr) > lead) {
                lead = Math.abs(curr);
                leader = (curr > 0) ? 1 : 2;
            }
        }

        pw.printf("%d %d %n", leader, lead);


        pw.flush();
        pw.close();
        br.close();
    }
}