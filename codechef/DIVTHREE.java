package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 01-01-2021, Friday
 **/
public class DIVTHREE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());
        int n, k, d;
        long sum, contests;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());

            sum = 0;
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                sum += Integer.parseInt(st.nextToken());
            }

            if (sum < k) {
                pw.println(0);
            } else {
                contests = Math.min(Math.floorDiv(sum, k), d);
                pw.println(contests);
            }
        }


        pw.flush();
        pw.close();
        br.close();
    }
}