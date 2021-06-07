package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 14-10-2020, Wednesday
 **/
public class PPSUM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        int d, n, ans;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            d = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            ans = sum(d, n);

            pw.println(ans);
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static int sum(int d, int n) {
        int ans = n;

        for (int i = 0; i < d; i++) {
            ans = (ans * (ans  + 1)) / 2;
        }

        return ans;
    }
}