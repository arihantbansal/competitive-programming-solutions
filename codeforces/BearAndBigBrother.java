package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 24-10-2020, Saturday
 **/
public class BearAndBigBrother {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int i;

        for (i = 1;; i++) {
            a *= 3;
            b *= 2;

            if(a > b) {
                break;
            }
        }

        pw.println(i);

        pw.flush();
        pw.close();
        br.close();
    }
}