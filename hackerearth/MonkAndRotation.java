package hackerearth;

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
public class MonkAndRotation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());
        int n, k, shift;
        int[] nums;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            nums = new int[n];
            shift = (k % n);
            st = new StringTokenizer(br.readLine().trim());
            int index;
            for (int j = 0; j < n; j++) {
                index = j + shift;
                if (index < n) {
                    nums[index] = Integer.parseInt(st.nextToken());
                } else {
                    nums[(index % n)] = Integer.parseInt(st.nextToken());
                }
            }

            for (int j = 0; j < n; j++) {
                pw.printf("%d ", nums[j]);
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}