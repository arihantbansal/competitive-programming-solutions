package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 19-12-2020, Saturday
 **/
public class BarkToUnlock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        char[] password = br.readLine().trim().toCharArray();
        int n = Integer.parseInt(br.readLine().trim());
        
        String[] words = new String[n];
        boolean[] exists = new boolean[2];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine().trim();
            if (words[i].charAt(0) == password[0] && words[i].charAt(1) == password[1]) {
                exists[0] = true;
                exists[1] = true;
            }
            if (words[i].charAt(0) == password[1]) {
                exists[0] = true;
            }
            if (words[i].charAt(1) == password[0]) {
                exists[1] = true;
            }
        }

        pw.println((exists[0] && exists[1]) ? "YES" : "NO");

        pw.flush();
        pw.close();
        br.close();
    }
}