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
public class PetrAndBook {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        int[] daily = new int[7];

        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < 7; i++) {
            daily[i] = Integer.parseInt(st.nextToken());
        }

        int day = 1;

        while (n > 0) {
            n -= daily[day - 1];
            if (n <= 0) break;
            if (day < 7) day++;
            else day = 1;
        }

        pw.println(day);

        pw.flush();
        pw.close();
        br.close();
    }
}