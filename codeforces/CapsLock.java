package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Author : Arihant Bansal
 * Date : 02-11-2020, Monday
 **/
public class CapsLock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().trim();
        int len = word.length();
        String left = word.substring(1);
        boolean is = left.toUpperCase().equals(left);
        char first = word.charAt(0);
        char c = Character.isLowerCase(first) ? Character.toUpperCase(first) : Character.toLowerCase(first);
        pw.println((is) ? (c + left.toLowerCase()) : word);

        pw.flush();
        pw.close();
        br.close();
    }
}