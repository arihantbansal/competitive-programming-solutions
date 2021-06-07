package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 29-10-2020, Thursday
 **/
public class ReconnaissanceTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        
        st = new StringTokenizer(br.readLine().trim());
        int[] heights = new int[n];
        int diff, min = Integer.MAX_VALUE, pos = 1;
        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(st.nextToken());
            if (i == 0) continue;
            diff = Math.abs(heights[i] - heights[i - 1]);
            if (diff < min) {
                min = diff;
                pos = i;
            }
        }

        diff = Math.abs(heights[n - 1] - heights[0]);

        if (diff < min) {
            pw.printf("%d %d%n", n, 1);
        } else {
            pw.printf("%d %d%n", pos, pos + 1);
        }


        pw.flush();
        pw.close();
        br.close();
    }
}