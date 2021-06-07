package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 14-10-2020, Wednesday
 **/
public class ArrivalOfTheGeneral {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        int[] heights = new int[n];
        int minIndex = 0, maxIndex = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
            if (heights[i] > max) {
                max = heights[i];
                maxIndex = i + 1;
            }
            if (heights[i] <= min) {
                min = heights[i];
                minIndex = i + 1;
            }
        }

        int t = (maxIndex - 1) + (n - minIndex);

        if (maxIndex > minIndex) t--;

        pw.println(t);

        pw.flush();
        pw.close();
        br.close();
    }
}