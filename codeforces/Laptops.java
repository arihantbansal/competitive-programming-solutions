package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 22-12-2020, Tuesday
 **/
public class Laptops {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim()), a, b;
        boolean happy = false;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine().trim());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(a != b) happy = true;
        }

        pw.println((happy) ? "Happy Alex" : "Poor Alex");

        pw.flush();
        pw.close();
        br.close();
    }
}