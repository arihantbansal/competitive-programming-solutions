package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author : Arihant Bansal
 * Date : 12-09-2021
 **/

public class ZOZ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            long sum = 0;
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }

            int validCount = 0;
            for (int j = 0; j < n; j++) {
                if ((arr[j] + k) > (sum - arr[j])) {
                    validCount++;
                }
            }
            pw.println(validCount);
        }


        pw.flush();
        pw.close();
        br.close();
    }
}