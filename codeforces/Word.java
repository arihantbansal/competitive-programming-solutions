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
public class Word {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char[] chars = s.toCharArray();

        int upper = 0, lower = 0;

        for (int i = 0; i < chars.length; i++) {
            if(Character.isLowerCase(chars[i])) {
                lower++;
            } else {
                upper++;
            }
        }

        if(upper <= lower) {
            s = new String(chars).toLowerCase();
        } else {
            s = new String(chars).toUpperCase();
        }

        pw.println(s);

        pw.flush();
        pw.close();
        br.close();
    }
}