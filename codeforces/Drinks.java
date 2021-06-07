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
public class Drinks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(st.nextToken());
        }

        pw.printf("%.12f%n",  ((double) sum / (double) n));

        pw.flush();
        pw.close();
        br.close();
    }
}