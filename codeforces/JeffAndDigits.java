package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Author : Arihant Bansal
 * Date : 20-11-2020, Friday
 **/
public class JeffAndDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine().trim());
        int five = 0, zero = 0, digit;
        st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            digit = Integer.parseInt(st.nextToken());
            if (digit == 5) five++;
            else zero++;
        }

        if (zero == 0) pw.println(-1);
        else if (five < 9) pw.println(0);
        else {
            for (int i = 0, fives = Math.floorDiv(five, 9) * 9; i < fives; i++) {
                pw.print(5);
            }
            for (int i = 0; i < zero; i++) {
                pw.print(0);
            }
        }

        pw.flush();
        pw.close();
        br.close();
    }
}