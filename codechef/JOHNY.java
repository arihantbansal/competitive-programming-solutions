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
 * Date : 17-10-2020, Saturday
 **/
public class JOHNY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, k, val, pos;
        int[] nums;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine().trim());
            nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }
            k = Integer.parseInt(br.readLine().trim());
            val = nums[k - 1];
            Arrays.sort(nums);
            pos = Arrays.binarySearch(nums, val);
            pw.println(pos + 1);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}