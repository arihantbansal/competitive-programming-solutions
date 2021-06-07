package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 04-11-2020, Wednesday
 **/
public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine().trim());
        int[] nums = new int[n];

        Arrays.fill(nums, 0);

        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n - 1; i++) {
            nums[Integer.parseInt(st.nextToken()) - 1] = 1;
        }

        int num = Arrays.toString(nums).replaceAll("[, ]", "").indexOf('0');
        pw.println(num);

        pw.flush();
        pw.close();
        br.close();
    }
}