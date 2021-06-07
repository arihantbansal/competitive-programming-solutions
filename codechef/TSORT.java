package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Author : Arihant Bansal
 * Date : 09-10-2020, Friday
 **/
public class TSORT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int[] nums = new int[t];

        for (int i = 0; i < t; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(nums);

        for(int a : nums) { pw.println(a); }

        pw.flush();
        pw.close();
        br.close();
    }
}