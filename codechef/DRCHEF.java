package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 02-11-2020, Monday
 **/
public class DRCHEF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());

        int n, x;
        int[] pop;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine().trim());
            pop = new int[n];
            for (int j = 0; j < n; j++) {
                pop[j] = Integer.parseInt(st.nextToken());
            }


        }

        pw.flush();
        pw.close();
        br.close();
    }
}