package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 29-10-2020, Thursday
 **/
public class NUM239 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        int l, r, l0, r0, count;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            l = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());

            l0 = l - (l % 10);
            r0 = r - (r % 10);

            count = ((r0 - l0 + 1) / 10) * 3;

            for (int j = l0 + 2; j < l; j++) {
                if (j % 10 == 2 || j % 10 == 3 || j % 10 == 9) count--;
            }

            for (int j = r0 + 2; j <= r; j++) {
                if (j % 10 == 2 || j % 10 == 3 || j % 10 == 9) count++;
            }

            pw.println(count);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}