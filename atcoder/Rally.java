package atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 18-11-2020, Wednesday
 **/
public class Rally {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        int[] nums = new int[n];
        long sum = 0;

        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            sum += nums[i];
        }

        long avg = Math.round(sum / (float) n);
        long stamina = 0;
        for (int i = 0; i < n; i++) {
            stamina += Math.pow(nums[i] - avg, 2);
        }

        pw.println(stamina);

        pw.flush();
        pw.close();
        br.close();
    }
}