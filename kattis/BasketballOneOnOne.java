package kattis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 18-11-2020, Wednesday
 **/
public class BasketballOneOnOne {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().trim();
        /*int a = 0, b = 0, point;
        char c;
        for (int i = 0, n = input.length(); i < n; i += 2) {
            c = input.charAt(i);
            point = Integer.parseInt(String.valueOf(input.substring(i + 1).charAt(0)));
            if (c == 'A') {
                a += point;
            } else {
                b += point;
            }

            if (a >= 10 && b >= 10) {
                if (Math.abs(a - b) >= 2) {
                    pw.println((a > b) ? "A" : "B");
                    break;
                }
            } else {
                if (a == 11) {
                    pw.println("A");
                    break;
                } else if (b == 11) {
                    pw.println("B");
                    break;
                }
            }
        }*/

        pw.println(input.charAt(input.length() - 2));

        pw.flush();
        pw.close();
        br.close();
    }
}