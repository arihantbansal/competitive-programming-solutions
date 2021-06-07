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
 * Date : 07-11-2020, Saturday
 **/
public class CHPINTU {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        int n, m;
        int[] fruits, prices;
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine().trim());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());

            fruits = new int[n];
            prices = new int[m];
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                fruits[j] = Integer.parseInt(st.nextToken()) - 1;
            }

            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < n; j++) {
                prices[fruits[j]] += Integer.parseInt(st.nextToken());
            }
            Arrays.sort(fruits);
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                if (Arrays.binarySearch(fruits, j) > -1) {
                    min = Math.min(min, prices[j]);
                }
            }
            pw.println(min);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}