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
 * Date : 18-10-2020, Sunday
 **/
public class MARCHA1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());

        int n, m, curr;
        int[] denom;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            denom = new int[n];
            for (int j = 0; j < n; j++) {
                denom[j] = Integer.parseInt(br.readLine().trim());
            }
            Arrays.sort(denom);
            
        }


        pw.flush();
        pw.close();
        br.close();
    }
}