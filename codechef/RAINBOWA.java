package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author : Arihant Bansal
 * Date : 12-09-2021
 **/

public class RAINBOWA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];

            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int start = 0, end = n - 1;
            boolean flag = false;
            boolean[] allNums = new boolean[7];

            while (start <= end) {
                if (arr[start] != arr[end]) {
                    flag = true;
                    break;
                }
                if (arr[start] > 7 || arr[start] < 1) {
                    flag = true;
                    break;
                } else {
                    allNums[arr[start] - 1] = true;
                }
                start++;
                end--;
            }

            pw.println(flag ? "no" : "yes");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}