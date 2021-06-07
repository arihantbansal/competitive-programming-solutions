package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 14-10-2020, Wednesday
 **/
public class HQ9Plus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        pw.println((input.indexOf('H') != - 1 || input.indexOf('Q') != -1 || input.indexOf('9') != -1) ? "YES" : "NO");

        pw.flush();
        pw.close();
        br.close();
    }
}