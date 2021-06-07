package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 09-10-2020, Friday
 **/
public class WayTooLongWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s;
        StringBuilder sb;
        int len;

        for (int i = 0; i < n; i++) {
            s = br.readLine();
            len = s.length();
            sb = new StringBuilder(len);
            if(len <= 10) {
                sb = new StringBuilder(s);
            } else {
                sb.append(s.charAt(0));
                sb.append(len - 2);
                sb.append(s.charAt(len - 1));
            }
            pw.println(sb);
        }

        pw.flush();
        pw.close();
        br.close();
    }
}