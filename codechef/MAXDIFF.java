package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 29-10-2020, Thursday
 **/
public class MAXDIFF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, k, m;
        long total, kid;
        long[] nums;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            nums = new long[n];
            total = 0;
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                nums[j] = Long.parseLong(st.nextToken());
                total += nums[j];
            }
            Arrays.sort(nums);
            m = Math.max(k, n - k);
            kid = 0;
            for (int j = n - 1; j >= (n - m); j--) {
                kid += nums[j];
            }

            pw.println(kid - (total - kid));
        }

        pw.flush();
        pw.close();
        br.close();
    }
}