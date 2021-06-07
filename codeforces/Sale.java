package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 20-11-2020, Friday
 **/
public class Sale {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine().trim());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        int sum = 0;
        for (int i = 0; i < m; i++) {
            if (nums[i] >= 0) break;
            else sum += nums[i];
        }

        pw.println(-sum);

        pw.flush();
        pw.close();
        br.close();
    }
}