package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 10-10-2020, Saturday
 **/
public class NearlyLuckyNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char[] chars = s.toCharArray();
        int count = 0;
        char c;

        for (int i = 0; i < chars.length; i++) {
            c = chars[i];
            if(c == '4' || c == '7') { count++; }
        }

        pw.println((count == 4 || count == 7) ? "YES" : "NO");

        pw.flush();
        pw.close();
        br.close();
    }
}