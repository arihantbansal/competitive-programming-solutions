package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 08-11-2020, Sunday
 **/
public class EOEO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int c = Integer.parseInt(br.readLine().trim());

        long ts, js, count, t;
        for (int i = 0; i < c; i++) {
            t = Long.parseLong(br.readLine().trim());
            count = 0;
            if (t % 2 == 0) {
                long maxPowerOfTwo = (t & (~(t - 1)));
                count = (long) (t / (maxPowerOfTwo * 2L));
            } else {
                count = Math.floorDiv(t, 2);
            }
            pw.println(count);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}