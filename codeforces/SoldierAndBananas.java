package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 23-10-2020, Friday
 **/
public class SoldierAndBananas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int k = Integer.parseInt(st.nextToken());
        long n = Long.parseLong(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        long cost = ((w * (w + 1)) * k) / 2;

        pw.println((cost > n) ? (cost - n) : 0);

        pw.flush();
        pw.close();
        br.close();
    }
}