package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 17-11-2020, Tuesday
 **/
public class MagicNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String num = br.readLine().trim();

        if (num.replaceAll("[14]", "").length() > 0 || num.charAt(0) == '4') {
            pw.println("NO");
        } else if (num.length() == 1) {
            pw.println((num.equals("1") ? "YES" : "NO"));
        } else {
            boolean magic = true;
            for (int i = 0, n = num.length(); i < n; i++) {
                char c = num.charAt(i);
                if (c != '1') {
                    magic = false;
                    break;
                }
                if (i == n - 2 || i == n - 1) {
                    magic = num.charAt(i) == '1';
                    break;
                }
                if (num.charAt(i + 1) == '4') {
                    if (num.charAt(i + 2) == '4') {
                        i += 2;
                    } else {
                        i += 1;
                    }
                }
            }
            pw.println(magic ? "YES" : "NO");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}