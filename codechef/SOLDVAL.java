package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 06-11-2020, Friday
 **/
public class SOLDVAL {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //TODO Complete DP problem

        int t = Integer.parseInt(br.readLine().trim());

        int n;
        long[] nums;
        for (int i = 0; i < t; i++) {
            n = Integer.parseInt(br.readLine().trim());
            nums = new long[n];
            
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }

        }


        pw.flush();
        pw.close();
        br.close();
    }
}