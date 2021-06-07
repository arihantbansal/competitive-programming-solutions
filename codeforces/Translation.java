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
public class Translation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String t = br.readLine();
        StringBuilder sb = new StringBuilder(s);

        pw.println((sb.reverse().toString().equals(t)) ? "YES" : "NO");

        pw.flush();
        pw.close();
        br.close();
    }
}