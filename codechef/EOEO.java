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
                for (long j = 2; j < t; j += 2) {
                    js = j;
                    ts = t;
                    while (true) {
                        if (ts % 2 == 0) {
                            if (js % 2 == 0) {
                                js = js / 2;
                                ts = ts / 2;
                            } else break;
                        } else {
                            if (js % 2 == 0) count++;
                            break;
                        }
                    }
                }
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