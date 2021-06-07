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
public class LittleElephantAndRozdil {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());

        int min = Integer.MAX_VALUE, count = 0, t, pos = 1;
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            t = Integer.parseInt(st.nextToken());
            if (t < min) {
                min = t;
                count = 1;
                pos = i + 1;
            } else if (t == min) {
                count++;
            }
        }

        pw.println((count == 1) ? pos : "Still Rozdil");

        pw.flush();
        pw.close();
        br.close();
    }
}