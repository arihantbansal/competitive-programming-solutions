package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 12-10-2020, Monday
 **/
public class Pangram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        String s = br.readLine().toLowerCase();

        if(len < 26) {
            pw.println("NO");
        } else if(len >= 26) {
            boolean all = true;
            for (int i = 97; i <= 122; i++) {
                if(s.indexOf((char) i) == -1) {
                    all = false;
                }
            }
            pw.println((all) ? "YES" : "NO");
        }

        pw.flush();
        pw.close();
        br.close();
    }
}