package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 15-10-2020, Thursday
 **/
public class CHEFARRP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, count = 0;
        int[] nums;

        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine().trim());
            nums = new int[n];

            for (int j = 0; j < n; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }
            count = count(nums);
            pw.println(count);
        }

        pw.flush();
        pw.close();
        br.close();
    }

    public static int count(int[] nums) {
        int sum, prod, n = nums.length, count = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            prod = 1;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                prod *= nums[j];
                if(sum == prod) { count++; }
            }
        }

        return count;
    }
}