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
public class HORSES {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, min, curr;
        int[] s;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            s = new int[n];
            st = new StringTokenizer(br.readLine().trim());
            min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                s[j] = Integer.parseInt(st.nextToken());
                for (int k = 0; k < j; k++) {
                    curr = Math.abs(s[k] - s[j]);
                    if (curr < min) {
                        min = curr;
                    }
                }
            }
            pw.println(min);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}