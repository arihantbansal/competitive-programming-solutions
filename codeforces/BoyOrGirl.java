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
public class BoyOrGirl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String username = br.readLine().toLowerCase();
        char c;
        int[] chars = new int[26];
        int count = 0;

        for (int i = 0; i < username.length(); i++) {
            c = username.charAt(i);
            chars[c - 'a']++;
        }

        for(int i : chars) {
            if(i > 0) count++;
        }

        pw.println((count % 2 == 0) ? "CHAT WITH HER!" : "IGNORE HIM!");

        pw.flush();
        pw.close();
        br.close();
    }
}