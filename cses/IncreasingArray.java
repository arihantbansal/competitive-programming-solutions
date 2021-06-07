package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 04-11-2020, Wednesday
 **/
public class IncreasingArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());

        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        long count = 0, diff;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                diff = nums [i - 1] - nums[i];
                nums[i] = nums[i - 1];
                count += diff;
            }
        }

        pw.println(count);

        pw.flush();
        pw.close();
        br.close();
    }
}