package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Author : Arihant Bansal
 * Date : 14-10-2020, Wednesday
 **/
public class AmusingJoke {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String guest = br.readLine();
        String host = br.readLine();
        String pile = br.readLine();

        StringBuilder sb = new StringBuilder();
        sb.append(guest);
        sb.append(host);

        String both = sb.toString();
        char[] bothChars = both.toCharArray();
        Arrays.sort(bothChars);
        both = new String(bothChars);

        char[] pileChars = pile.toCharArray();
        Arrays.sort(pileChars);
        pile = new String(pileChars);

        pw.println((pile.compareToIgnoreCase(both) == 0) ? "YES" : "NO");

        pw.flush();
        pw.close();
        br.close();
    }
}