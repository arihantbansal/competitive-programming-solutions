package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 29-10-2020, Thursday
 **/
public class AntonAndDanik {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().trim());
        String res = br.readLine().trim();

        int a = res.length() - res.replaceAll("[A]", "").length();
        int d = res.length() - res.replaceAll("[D]", "").length();

        pw.println((a == d) ? "Friendship" : ((a > d) ? "Anton" : "Danik"));

        pw.flush();
        pw.close();
        br.close();
    }
}