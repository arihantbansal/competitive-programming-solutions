package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 18-10-2020, Sunday
 **/
public class CARVANS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, max;
        int[] speeds;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            speeds = new int[n];
            max = 0;

            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                speeds[j] = Integer.parseInt(st.nextToken().trim());
                if(j > 0) {
                    if(speeds[j] < speeds[j - 1]) {
                        max++;
                    } else {
                        speeds[j] = speeds[j - 1];
                    }
                } else {
                    max++;
                }
            }

            pw.println(max);
        }


        pw.flush();
        pw.close();
        br.close();
    }
}