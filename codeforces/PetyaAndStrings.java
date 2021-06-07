package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 11-10-2020, Sunday
 **/
public class PetyaAndStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String first = br.readLine(), second = br.readLine();
        int n = first.compareToIgnoreCase(second);

        pw.println((n == 0) ? "0" : ((n > 0) ? "1" : "-1"));

        pw.flush();
        pw.close();
        br.close();
    }
}