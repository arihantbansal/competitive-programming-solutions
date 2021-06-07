package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 19-12-2020, Saturday
 **/
public class TrailingZeroes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine().trim());
        long div = 5, ans = 0;
        while (n >= div) {
            ans += Math.floorDiv(n, div);
            div = div * 5;
        }

        pw.println(ans);

        pw.flush();
        pw.close();
        br.close();
    }
}