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
 * Date : 02-11-2020, Monday
 **/
public class CARSELL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n;
        long profit;
        int[] nums;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());

            nums = new int[n];
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(nums);

            profit = 0;
            for (int j = 0; j < n; j++) {
                nums[j] = Math.max((nums[j] - (n - 1 - j)), 0);
                profit = (long) ((profit + nums[j]) % (Math.pow(10, 9) + 7));
            }

            pw.println(profit);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}